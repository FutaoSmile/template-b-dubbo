package com.idle.fish.template.dubbo.web.login;

import com.idle.fish.template.basic.login.interceptor.UserAuthInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Component
public class WebMvc implements WebMvcConfigurer {
    @Resource
    private UserAuthInterceptor userAuthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 权限拦截器
        registry.addInterceptor(userAuthInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/**/uploadFile")
                .excludePathPatterns("/doc/**")
                .excludePathPatterns("/login/**")
        ;
    }
}
