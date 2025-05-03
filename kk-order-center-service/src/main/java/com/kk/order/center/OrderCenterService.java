package com.kk.order.center;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Zal
 */
@SpringBootApplication
@EnableDubbo
@EnableDubboConfig
@EnableAspectJAutoProxy
@Slf4j
@ComponentScan(basePackages = {"com.kk.arch.common.conf", "com.kk.order.center.*"})
public class OrderCenterService {

    public static void main(String[] args) {
        SpringApplication.run(OrderCenterService.class, args);
    }

}
