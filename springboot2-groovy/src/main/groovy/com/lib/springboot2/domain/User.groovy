package com.lib.springboot2.domain

/**
 * @Author wtx
 * @Date 2018/11/5 上午8:00
 */

class User {
    Long id
    String name
    String phone

    User(Long id, String name, String phone) {
        this.id = id
        this.name = name
        this.phone = phone
    }
}