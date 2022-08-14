package com.shuaicai.record.service;


import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 19:18
 * @PackagePath com.shuaicai.record.service
 * @Version 1.0
 */
//@Service
public interface LoginService {
    //登录方法
    Object login(Verification verification);
}
