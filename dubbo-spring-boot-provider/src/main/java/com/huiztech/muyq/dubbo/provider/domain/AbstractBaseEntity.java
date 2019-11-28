package com.huiztech.muyq.dubbo.provider.domain;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Date;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/10 10:08]
 * @description []
 */
@Data
public abstract class AbstractBaseEntity {
    private String lastModifyBy;
    private Date lastModifyDate;
    private String createdBy;
    private Date createdDate;
    private Boolean deleted;
    @Version
    private Integer version;
}
