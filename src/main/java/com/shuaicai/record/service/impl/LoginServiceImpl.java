package com.shuaicai.record.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.shuaicai.record.mapper.ConsumptionRecordMapper;
import com.shuaicai.record.mapper.UserMapper;
import com.shuaicai.record.mapper.VerificationMapper;
import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import com.shuaicai.record.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
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

    @Override
    public Object login(Verification verification) {

        Verification user = verificationMapper.getVerification(verification.getAccountNumber());
        if (user == null) {
            return "账号名错误";
        }
        if (!user.getPassWord().equals(user.getPassWord())){
            return "密码错误";
        }
        return "login";
    }
    //查询所有消费记录
    public List<ConsumptionRecord> consumptionAll(){
        List<ConsumptionRecord> consumptionRecords = consumptionRecordMapper.selectList(new QueryChainWrapper<>());
        return consumptionRecords;
    }
}
