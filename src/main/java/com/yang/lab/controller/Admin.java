package com.yang.lab.controller;

import com.yang.lab.service.AdminService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class Admin {

    @Resource
    private AdminService adminService;

    @RequestMapping("/list")
    public List<com.yang.lab.entity.Admin> listadmin()
    {
        return adminService.adminlist();
    }

}
