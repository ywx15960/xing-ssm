package com.xing.service.impl;

import com.xing.dao.UserMapper;
import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yewenxin on 2021/6/7.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public Map<String, Object> getUserInfo(String id) {
        return userMapper.getUserInfo(id);
    }
}
