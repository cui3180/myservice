package com.cui.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by cjs
 * Date： 2017/7/18.
 * Time： 17:27.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // 映射 /static 的请求到 classpath 下的 static 目录

        registry.addResourceHandler("/layui/**")
                .addResourceLocations("classpath:/layui/");
    }

}