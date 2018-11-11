package com.libw.springboot2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @Author wtx
 * @Date 2018/11/11 下午5:03
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CnodeTopicsResponse {
    private boolean success;
    private List<CnodeArticle> data;

}
