package com.atguigu.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {


    @Bean
    public IRule myRule(){

        return new RandomRule();//随机，并且不能在@componentScan扫描包下
    }


}
