package com.xing.controller;

import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yewenxin on 2021/5/30.
 */
@Controller
public class HelloController {
    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图,
     * 对于InternalResourceViewResolver视图解析器，会做如下解析 通过prefix+returnValue+suffix
     * 这样的方式得到实际的物理视图，既组成"/WEB-INF/result.jsp"  然后会返回给dispatchservlet
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/click")
    public String hello()
    {
        Map<String, Object> map = null;
        try{
            System.out.println("hello world");
            map = userService.getUserInfo("d711d838c12a11eb908900e04f71dba6");
            System.out.println(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "jsp/result";
    }
}
