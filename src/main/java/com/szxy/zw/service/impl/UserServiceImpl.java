package com.szxy.zw.service.impl;

import com.szxy.zw.mapper.UserMapper;
import com.szxy.zw.pojo.User;
import com.szxy.zw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/2 9:25
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
