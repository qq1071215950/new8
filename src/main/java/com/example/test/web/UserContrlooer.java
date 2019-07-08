package com.example.test.web;

import com.example.test.pojo.Resource;
import com.example.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/user")
public class UserContrlooer {
   /* 获取用户信息 /user/getUser*/
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    private User getUser(){
        User user = new User();
        user.setUserId(22);
        user.setUserName("张三");
        user.setAge(11);
        user.setSex(2);
        user.setAddress("长沙");
        user.setBirthday(new Date());
        user.setEmail("1071215950");
        return user;
    }
    @Autowired
    private Resource resource;
    /*资源配置映射实体类 */
    @RequestMapping(value = "/getResource",method = RequestMethod.GET)
    private Resource getResource(){
        return  resource;
    }
}
