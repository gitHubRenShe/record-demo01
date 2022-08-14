package com.shuaicai.record.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @ClassName verification
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/14 19:26
 * @PackagePath com.shuaicai.record.pojo
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("verification")
public class Verification {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "account_number")
    private String accountNumber;

    @TableField("pass_word")
    private String passWord;

    @TableField("create_time")
    private Date createTime;

    private Date mtime;

}
