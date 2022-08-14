package com.shuaicai.record.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName VerificationMapper
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/14 19:36
 * @PackagePath com.shuaicai.record.mapper
 * @Version 1.0
 */
public interface VerificationMapper extends BaseMapper<Verification> {

    Verification getVerification(@Param("accountNumber") String accountNumber);
}
