package com.example.demo.bootmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerTest {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/producerTest")
    public void test1(){
        //同步：等待返回结果，重要消息
        //异步：响应快，异步返回结果，不重要消息
        rocketMQTemplate.convertAndSend("springboot-mq","hello springboot rocketmq");
    }
}