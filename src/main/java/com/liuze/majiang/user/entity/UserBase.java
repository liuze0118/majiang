package com.liuze.majiang.user.entity;

import lombok.Data;

@Data
public class UserBase {
    private long id;
    private String name;
    private String password;
    private String nikeName;
    private String mobilePhone;

}
