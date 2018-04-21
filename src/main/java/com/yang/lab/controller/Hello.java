package com.yang.lab.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

//@RestController
@SpringBootApplication
@Controller
public class Hello {
    @RequestMapping("/")
    public String hello(Map<String, Object> model) {
        model.put("username", "ly");
        model.put("password", "ly1234");
        return "main/login";
    }

}
