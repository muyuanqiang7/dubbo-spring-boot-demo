package com.huiztech.muyq.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huiztech.muyq.dubbo.common.dto.ProviderDto;
import com.huiztech.muyq.dubbo.common.service.IProviderService;
import com.huiztech.muyq.dubbo.provider.domain.User;
import com.huiztech.muyq.dubbo.provider.service.IUserService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/9 07:26]
 * @description []
 */
@Service(version = "1.0.0", group = "huiztech")
public class ProviderServiceImpl implements IProviderService {
    @Resource
    private IUserService userService;
    private Random rand = SecureRandom.getInstanceStrong();

    public ProviderServiceImpl() throws NoSuchAlgorithmException {
    }


    @Override
    public List<ProviderDto> queryList() {
        IPage<User> page = new Page<>();
        return userService.page(page).getRecords().stream().map(user -> {
            ProviderDto dto = new ProviderDto();
            dto.setId(user.getStatus());
            dto.setName(user.getName());
            dto.setNumber(rand.nextInt());
            return dto;
        }).collect(Collectors.toList());
    }
}
