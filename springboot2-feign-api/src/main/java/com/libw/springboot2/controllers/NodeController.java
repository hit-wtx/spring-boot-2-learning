package com.libw.springboot2.controllers;

import com.libw.springboot2.interfaces.NodeClient;
import com.libw.springboot2.model.CnodeTopicsRequest;
import com.libw.springboot2.model.CnodeTopicsResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wtx
 * @Date 2018/11/11 下午5:08
 */
@RestController
@CrossOrigin
@Slf4j
public class NodeController {
    @Autowired
    private NodeClient nodeClient;

    @RequestMapping(value = "/node", method = RequestMethod.GET)
    @HystrixCommand(
            fallbackMethod = "emptyTopics",
            threadPoolProperties = {  //10个核心线程池,超过20个的队列外的请求被拒绝;
                    // 当一切都是正常的时候，线程池一般仅会有1到2个线程激活来提供服务
                    @HystrixProperty(name = "coreSize", value = "10"),
                    @HystrixProperty(name = "maxQueueSize", value = "100"),
                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "20")},
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"), //命令执行超时时间
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2"), //若干10s一个窗口内失败三次, 则达到触发熔断的最少请求量
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000") //断路30s后尝试执行, 默认为5s
            })
    public CnodeTopicsResponse get(CnodeTopicsRequest cnodeTopicsRequest) {
        return nodeClient.getTopics(cnodeTopicsRequest.getPage(),
                cnodeTopicsRequest.getTab(),
                cnodeTopicsRequest.getLimit(),
                cnodeTopicsRequest.getMdrender());
    }

    public CnodeTopicsResponse emptyTopics(CnodeTopicsRequest cnodeTopicsRequest) {
        log.info("HystrixNodeClientFallback getTopics");
        return new CnodeTopicsResponse();
    }
}
