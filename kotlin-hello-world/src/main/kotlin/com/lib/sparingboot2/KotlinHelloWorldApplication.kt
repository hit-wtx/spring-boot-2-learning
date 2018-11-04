package com.lib.sparingboot2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinHelloWorldApplication

fun main(args: Array<String>) {
    runApplication<KotlinHelloWorldApplication>(*args)
}
