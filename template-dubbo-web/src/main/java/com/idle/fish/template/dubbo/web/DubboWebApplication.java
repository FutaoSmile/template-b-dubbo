package com.idle.fish.template.dubbo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@ImportResource(locations = {"classpath:dubbo/*.xml"})
@SpringBootApplication
public class DubboWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboWebApplication.class, args);
    }
}
