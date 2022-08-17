package com.shuaicai.record.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @ClassName ConsumptionRecord
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 18:13
 * @PackagePath com.shuaicai.record.pojo
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("consumption_record")
public class ConsumptionRecord {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private BigDecimal amount;

    private String payee;

    private String type;

    private int consumer;

    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    private Date mtime;

}
