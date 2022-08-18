package com.shuaicai.record.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuaicai.record.pojo.User;
import com.shuaicai.record.pojo.Verification;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 18:44
 * @PackagePath com.shuaicai.record.mapper
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {


}
