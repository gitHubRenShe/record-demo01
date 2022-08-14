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
 * @ClassName UserName
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/13 18:12
 * @PackagePath com.shuaicai.record.pojo
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_name")
    private String userName;


    @TableField("phone_num")
    private String phoneNum;

    private String email;

    private String address;

    @TableField("create_time")
    private Date createTime;

    private Date mtime;
}
