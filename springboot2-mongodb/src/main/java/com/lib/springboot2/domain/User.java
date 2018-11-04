package com.lib.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * @Author wtx
 * @Date 2018/11/4 下午10:56
 */
@Getter
@Setter
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    private String username;
    private Integer age;
}
