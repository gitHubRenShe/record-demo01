package com.shuaicai.record.controller;

import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import com.shuaicai.record.service.LoginService;
import com.shuaicai.record.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Object login(@RequestBody Verification verification){

        return loginService.login(verification);
    }

    @GetMapping("/ConsumptionAll")
    public ResponseResult consumptionAll(){
        List<ConsumptionRecord> consumptionRecords = loginService.consumptionAll();

        return new ResponseResult(200,"全部记录",consumptionRecords);
    }


    @GetMapping("/hello")
    public Object hello(){

        return "你好";
    }

}
