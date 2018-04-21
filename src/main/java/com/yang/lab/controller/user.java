package com.yang.lab.controller;

import com.yang.lab.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class user {
    List<User> users=new ArrayList<User>();

    //@RequestMapping("/userlist")
    //public String userlist()
    //{
        //return"hello userlist!";
    //}

    @RequestMapping("/userdel")
    public  String userdel()
    {
        return "";
    }
    @RequestMapping("/List")
    public List<User> userlist()
    {
        List<User> users=new ArrayList<User>();
        User user=new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setRemark("hello this is test");

        User user2=new User();
        user2.setUsername("zhangsansssss");
        user2.setPassword("123456sssss");
        user2.setRemark("hello this is testsssss");

        User user3=new User();
        user3.setUsername("zhangsanaaa");
        user3.setPassword("123456aaa");
        user3.setRemark("hello this is testaaaa");

        users.add(user);
        users.add(user2);
        users.add(user3);
        return users;

    }
    @RequestMapping("/search")
    public User usersearch()
    {
        User user=new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setRemark("hello this is test");
        return user;

    }
    @RequestMapping("/useradd")
    public List<User> useradd(HttpServletRequest request)
    {
        String uname=request.getParameter("username");
        String upass=request.getParameter("password");
        User user=new User();
        user.setUsername(uname);
        user.setPassword(upass);
        user.setRemark("new user");
        users.add(user);
        return users;

    }

    @RequestMapping("/userturn")
    public  String userturn()
    {
        return "1234";
    }
}
