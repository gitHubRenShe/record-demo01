package com.shuaicai.record.controller;

import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import com.shuaicai.record.resolver.CurrentUserId;
import com.shuaicai.record.service.LoginService;
import com.shuaicai.record.utils.JwtUtil;
import com.shuaicai.record.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 18:46
 * @PackagePath com.shuaicai.record.controller
 * @Version 1.0
 */
@RequestMapping("sc")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody Verification verification) {
        //校验用户名是否正确
        Verification loginUser = loginService.login(verification);
        if (loginUser != null) {
            String token = JwtUtil.createJWT(UUID.randomUUID().toString(), String.valueOf(loginUser.getId()), null);
            //创建一个Map集合返回给前端
            Map<String,Object> map = new HashMap<>();
            map.put("token",token);
            return new ResponseResult(200, "登录成功", map);

        }
        return new ResponseResult(300, "用户名或密码错误，请重新登录");
    }


    //查询全部消费记录
    @GetMapping("/ConsumptionAll")
    public ResponseResult consumptionAll(@CurrentUserId String userId) {
        List<ConsumptionRecord> consumptionRecords = loginService.consumptionAll("1");

        return new ResponseResult(200, "全部记录", consumptionRecords);
    }


    @GetMapping("/hello")
    public Object hello() {

        return "你好";
    }

}
