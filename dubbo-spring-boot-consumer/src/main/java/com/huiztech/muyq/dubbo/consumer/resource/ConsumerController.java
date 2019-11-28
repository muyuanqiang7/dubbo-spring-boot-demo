package com.huiztech.muyq.dubbo.consumer.resource;

import com.huiztech.muyq.dubbo.common.dto.ProviderDto;
import com.huiztech.muyq.dubbo.common.service.IProviderService;
import com.huiztech.muyq.dubbo.common.vo.ResultVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/9 07:28]
 * @description []
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Reference(version = "1.0.0", group = "huiztech")
    private IProviderService providerService;

    @SuppressWarnings(value = "unchecked")
    @GetMapping(value = "/list")
    public ResultVO getList() {
        // 远程调用
        List<ProviderDto> providerDto = providerService.queryList();
        return new ResultVO.Builder<>().code(200).message("success").data(providerDto).build();
    }

}
