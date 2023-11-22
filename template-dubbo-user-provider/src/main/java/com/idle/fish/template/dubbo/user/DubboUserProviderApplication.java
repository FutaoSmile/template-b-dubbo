package com.idle.fish.template.dubbo.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@EnableDubbo
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/*.xml"})
public class DubboUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboUserProviderApplication.class, args);
    }
}
