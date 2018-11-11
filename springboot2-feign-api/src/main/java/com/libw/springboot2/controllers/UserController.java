package com.libw.springboot2.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wtx
 * @Date 2018/11/11 下午4:55
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private RemoteService remoteService;

    @RequestMapping("/index")
    public String index() {
        //log.info("index方法");
        //return remoteService.api("");
        return "";
    }

}
