package com.yang.lab.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String username="";
    private String password="";
    private String tel="";
    private String remark="";
}
