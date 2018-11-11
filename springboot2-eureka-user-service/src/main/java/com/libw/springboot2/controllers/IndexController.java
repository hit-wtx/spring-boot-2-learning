package com.libw.springboot2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wtx
 * @Date 2018/11/11 下午3:12
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }
}
