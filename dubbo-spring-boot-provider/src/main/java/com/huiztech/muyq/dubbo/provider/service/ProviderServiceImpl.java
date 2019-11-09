package com.huiztech.muyq.dubbo.provider.service;

import com.google.common.collect.Lists;
import com.huiztech.muyq.dubbo.common.dto.ProviderDto;
import com.huiztech.muyq.dubbo.common.service.IProviderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/9 07:26]
 * @description []
 */
@Service
public class ProviderServiceImpl implements IProviderService {
    @Override
    public List<ProviderDto> queryList() {
        // 初始化数据
        ProviderDto testDTO1 = new ProviderDto();
        testDTO1.setId(1);
        testDTO1.setName("学生");
        testDTO1.setNumber(100);
        ProviderDto testDTO2 = new ProviderDto();
        testDTO2.setId(2);
        testDTO2.setName("教师");
        testDTO2.setNumber(101);
        // 组装数据
        List<ProviderDto> list = Lists.newArrayList();
        list.add(testDTO1);
        list.add(testDTO2);
        return list;
    }
}
