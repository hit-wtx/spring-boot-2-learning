package com.libw.springboot2.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author wtx
 * @Date 2018/11/4 下午9:38
 */
@Getter
@Setter
public class UserDomain {
    private Integer userId;
    private String userName;
    private String password;
    private String phone;
}