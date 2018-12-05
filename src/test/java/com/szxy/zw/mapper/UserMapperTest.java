package com.szxy.zw.mapper;

import com.szxy.zw.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zhangwei
 * @date 2018/12/2 9:02
 */
public class UserMapperTest {

    @Test
    public void queryUserList() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserList();
        System.out.println(users);
    }
}