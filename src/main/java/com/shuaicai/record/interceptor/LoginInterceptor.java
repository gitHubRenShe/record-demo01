package com.shuaicai.record.interceptor;

import com.shuaicai.record.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/18 20:31
 * @PackagePath com.shuaicai.record.interceptor
 * @Version 1.0
 * 拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求头中的token
        String token = request.getHeader("token");
        //判断是否为空
        if (!StringUtils.hasText(token)){
//            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            throw new RuntimeException("未登录，请登陆后重试");//为空就抛出异常
        }
        //查看解析是否成功
        try {
            Claims claims = JwtUtil.parseJWT(token);
            String subject = claims.getSubject();
            System.out.println(subject);
        } catch (Exception e) {
            e.printStackTrace();//打印异常
            throw new RuntimeException("未登录，请登陆后重试");//解析失败就抛出异常
        }
        return true; //token正确返回true放行
    }
}
