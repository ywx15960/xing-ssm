package com.xing.dao;

import java.util.Map;

/**
 * Created by yewenxin on 2021/6/2.
 */
public interface UserMapper {
    public Map<String,Object> getUserInfo(String id);
}
