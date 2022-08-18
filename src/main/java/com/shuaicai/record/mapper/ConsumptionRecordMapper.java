package com.shuaicai.record.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuaicai.record.pojo.ConsumptionRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ConsumptionRecordMapper
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 21:14
 * @PackagePath com.shuaicai.record.mapper
 * @Version 1.0
 */
@Repository
public interface ConsumptionRecordMapper extends BaseMapper<ConsumptionRecord> {
    List<ConsumptionRecord> consumptionAll(String userId);
}
