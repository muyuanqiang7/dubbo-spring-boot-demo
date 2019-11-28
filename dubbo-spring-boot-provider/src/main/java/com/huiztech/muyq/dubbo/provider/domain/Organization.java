package com.huiztech.muyq.dubbo.provider.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/13 23:48]
 * @description []
 */
@Data
@ToString
@EqualsAndHashCode
@TableName(value = "organization")
public class Organization extends AbstractBaseEntity {
}
