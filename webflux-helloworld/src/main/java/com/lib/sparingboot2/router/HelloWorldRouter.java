package com.lib.sparingboot2.router;

import com.lib.sparingboot2.handler.HelloWorldHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @Author wtx
 * @Date 2018/11/4 下午4:12
 */
@Configuration
public class HelloWorldRouter {
    @Bean
    public RouterFunction<ServerResponse> routeCity(HelloWorldHandler helloWorldHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        helloWorldHandler::helloWorld);
    }
}
