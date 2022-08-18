package com.shuaicai.record.config;

import com.shuaicai.record.resolver.UserIdArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @ClassName ArgumentResolverConfig
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/18 21:37
 * @PackagePath com.shuaicai.record.config
 * @Version 1.0
 */
//配置添加ArgumentResolver参数解析器
@Configuration
public class ArgumentResolverConfig implements WebMvcConfigurer {

    @Autowired
    private UserIdArgumentResolver userIdArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(userIdArgumentResolver);
    }
}
