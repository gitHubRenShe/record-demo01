package com.shuaicai.record.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.shuaicai.record.mapper.ConsumptionRecordMapper;
import com.shuaicai.record.mapper.UserMapper;
import com.shuaicai.record.mapper.VerificationMapper;
import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import com.shuaicai.record.service.LoginService;
import com.shuaicai.record.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description
 * @Author shuai cai
 * @Date 2022/8/13 20:50
 * @PackagePath com.shuaicai.record.service.impl
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private VerificationMapper verificationMapper;

    @Autowired
    private ConsumptionRecordMapper consumptionRecordMapper;

    //验证用户
    @Override
    public Verification login(Verification verification) {

        return verificationMapper.getVerification(verification);

    }
    //查询所有消费记录
    public List<ConsumptionRecord> consumptionAll(String userId){

        List<ConsumptionRecord> consumptionRecords = consumptionRecordMapper.consumptionAll(userId);
        return consumptionRecords;
    }
}