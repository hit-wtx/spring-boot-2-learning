package com.libw.springboot2.interfaces;

import com.libw.springboot2.model.CnodeTopicsResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * @Author wtx
 * @Date 2018/11/11 下午5:01
 */

@Headers("Content-Type:application/json")
public interface NodeClient {
    @RequestLine("GET /api/v1/topics?page={page}&tab={tab}&limit={limit}&mdrender={mdrender}")
    CnodeTopicsResponse getTopics(@Param("page") int page, @Param("tab") String tab,
                                  @Param("limit") int limit, @Param("mdrender") String mdrender);
}
