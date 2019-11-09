package com.huiztech.muyq.dubbo.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/8 23:56]
 * @description []
 */
@Data
public class ProviderDto implements Serializable {

    private static final long serialVersionUID = -6571313486670284512L;
    /**
     * id
     */
    private int id;
    /**
     * name
     */
    private String name;
    /**
     * number
     */
    private Integer number;
}
