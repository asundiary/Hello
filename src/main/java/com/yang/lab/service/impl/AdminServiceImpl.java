package com.yang.lab.service.impl;

import com.yang.lab.dao.AdminDao;
import com.yang.lab.entity.Admin;
import com.yang.lab.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")

public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    @Override
    public List<Admin> adminlist()
    {
        return adminDao.adminlist();
    }
}
