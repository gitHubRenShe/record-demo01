package com.shuaicai.record.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuaicai.record.pojo.ConsumptionRecord;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName VerificationMapper
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/14 19:36
 * @PackagePath com.shuaicai.record.mapper
 * @Version 1.0
 */
@Repository
public interface VerificationMapper extends BaseMapper<Verification> {

    Verification getVerification(Verification verification);


}
