package com.lib.sparingboot2.controllers

import com.lib.sparingboot2.model.HelloDto
import com.lib.sparingboot2.services.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *  @Author wtx
 *  @Date 2018/11/4 下午3:15
 */

@RestController
class HelloController(val helloService: HelloService) {
    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "hello world"
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }

    @GetMapping("/hello-dto")
    fun helloDto(): HelloDto {
        return HelloDto("Hello from the dto")
    }


}