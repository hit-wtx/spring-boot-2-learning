package com.lib.sparingboot2.services

import org.springframework.stereotype.Service

/**
 *  @Author wtx
 *  @Date 2018/11/4 下午3:18
 */

@Service
class HelloService {

    fun getHello(): String {
        return "hello service"
    }
}
