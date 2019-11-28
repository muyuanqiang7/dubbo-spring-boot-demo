package com.huiztech.muyq.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/8 23:49]
 * @description []
 */
@SpringBootApplication
@EnableDubbo
@MapperScans(@MapperScan(basePackages = "com.huiztech.muyq.dubbo.provider.mapper"))
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
