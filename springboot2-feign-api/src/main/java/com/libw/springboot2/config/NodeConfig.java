package com.libw.springboot2.config;

import com.libw.springboot2.interfaces.NodeClient;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wtx
 * @Date 2018/11/11 下午5:05
 */
@Configuration
public class NodeConfig {
    @Value("${application.cnode.url}")
    private String baseUrl;

    @Bean
    NodeClient nodeClient() {
        return HystrixFeign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .setterFactory((target, method) ->
                        new SetterFactory.Default().create(target, method).
                                andCommandPropertiesDefaults(HystrixCommandProperties.defaultSetter().
                                        withExecutionTimeoutInMilliseconds(10000)))
                .target(NodeClient.class, this.baseUrl);
    }
}
