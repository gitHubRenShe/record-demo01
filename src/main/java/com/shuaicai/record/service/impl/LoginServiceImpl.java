package com.shuaicai.record.service.impl;

import com.shuaicai.record.mapper.UserMapper;
import com.shuaicai.record.mapper.VerificationMapper;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import com.shuaicai.record.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
