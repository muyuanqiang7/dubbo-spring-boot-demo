package com.huiztech.muyq.dubbo.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/13 23:11]
 * @description []
 */
@Data
@ToString
@EqualsAndHashCode
@TableName(value = "employee")
public class Employee extends AbstractBaseEntity {
    /**
     * 启用状态
     */
    public static final int ENABLE_STATUS = 0;
    /**
     * 禁用状态
     */
    public static final int DISABLE_STATUS = 1;
    /**
     * 删除状态
     */
    public static final int DELETE_STATUS = 1;
    @TableId(type = IdType.UUID)
    private String id;
    private String name;
    private String loginName;
    private String code;
    private String address;
    private String password;
    private String mobile;
    private int status;
}
