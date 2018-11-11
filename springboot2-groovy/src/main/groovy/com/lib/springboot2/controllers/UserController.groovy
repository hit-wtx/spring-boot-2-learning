package com.lib.springboot2.controllers

import com.lib.springboot2.domain.User
import com.lib.springboot2.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author wtx
 * @Date 2018/11/5 上午7:59
 */

@RestController
class UserController {
    @Autowired
    private UserService userService

    @GetMapping("/user")
    String getUser() {
        User man = userService.getInfoByName("wtx")
        return "ok ==> groovy " + "name:" + man.name
    }

}