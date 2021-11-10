package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.UUID;


/**
 * @className: PaymentController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-04 00:26
 */

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private  String serverPort;


    @RequestMapping(value = "/zk")
    public String paymentzk() {

        return "springcloud zookeeper :"+ serverPort+"\t" + UUID.randomUUID().toString();
    }



}
