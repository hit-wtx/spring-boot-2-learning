package com.lib.springboot2.services

import com.lib.springboot2.domain.User

/**
 * @Author wtx
 * @Date 2018/11/5 上午8:01
 */
interface UserService {
    User getInfoByName(String name)
}