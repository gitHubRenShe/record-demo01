package com.shuaicai.record.service;


import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import org.springframework.stereotype.Service;

import java.util.List;

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
    //登录验证方法
    Verification login(Verification verification);
    //查询所有消费记录
    List<ConsumptionRecord> consumptionAll(String userId);
}
