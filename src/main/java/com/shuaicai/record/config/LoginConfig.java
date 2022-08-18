package com.shuaicai.record.config;

import com.shuaicai.record.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName LoginConfig
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/18 20:40
 * @PackagePath com.shuaicai.record.config
 * @Version 1.0
 */
//将自定义的拦截器添加到项目配置
@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)//添加拦截器
                .addPathPatterns("/**")//配置拦截路径
                .excludePathPatterns("/sc/login");//配置排除路径
    }
}
