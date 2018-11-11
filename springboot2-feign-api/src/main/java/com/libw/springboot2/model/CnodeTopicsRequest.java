package com.libw.springboot2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author wtx
 * @Date 2018/11/11 下午5:04
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CnodeTopicsRequest {
    private Integer page;
    private String tab;
    private Integer limit;
    private String mdrender;
}
