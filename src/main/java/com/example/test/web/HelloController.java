package com.example.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/getHeLLo" ,method = RequestMethod.GET)
    private String getHello(){
        return "hello springboot first test";
    }
}
