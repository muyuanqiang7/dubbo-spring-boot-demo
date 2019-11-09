package com.huiztech.muyq.dubbo.common.service;

import com.huiztech.muyq.dubbo.common.dto.ProviderDto;

import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/9 07:16]
 * @description []
 */
public interface IProviderService {
    List<ProviderDto> queryList();
}
