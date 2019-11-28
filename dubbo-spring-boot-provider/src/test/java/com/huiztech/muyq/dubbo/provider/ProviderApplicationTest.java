package com.huiztech.muyq.dubbo.provider;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.huiztech.muyq.dubbo.provider.domain.User;
import com.huiztech.muyq.dubbo.provider.service.IEmployeeService;
import com.huiztech.muyq.dubbo.provider.service.IUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/10 10:58]
 * @description []
 */

@SpringBootTest(classes = com.huiztech.muyq.dubbo.provider.ProviderApplication.class)
public class ProviderApplicationTest {
    @Resource
    private IUserService userService;
    @Resource
    private IEmployeeService employeeService;

    @Test
    public void contextLoad() {
        long start = System.currentTimeMillis();
        List<User> users = userService.findByStatus(User.ENABLE_STATUS);
        System.out.println(users);
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("孙俪");
        user.setLoginName("SunLi");
        user.setAddress("四川省成都市高新区天府五街");
        user.setCode("001000");
        user.setMobile("18180219917");
        user.setPassword("@5200192");
        user.setStatus(User.ENABLE_STATUS);
        user.setCreatedBy("Admin");
        user.setLastModifyBy("Admin");
        Date date = new Date();
        user.setCreatedDate(date);
        user.setLastModifyDate(date);
        user.setDeleted(false);
        user.setVersion(0);
        userService.insertUser(user);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void findAllUser() {
//        System.out.println(userService.count());
        long start = System.currentTimeMillis();
        userService.list();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void queryUser() {
//        System.out.println(userService.count());
        long start = System.currentTimeMillis();
        System.out.println(userService.list(new QueryWrapper<User>().lambda().eq(User::getMobile, "15855449035")).size());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void saveBatch() {
        long start = System.currentTimeMillis();
        List<User> users = Lists.newArrayList();
        for (int i = 0; i < 300000; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName("陈寿亭");
            user.setLoginName("ChenShoTing");
            user.setAddress("山东省济南市周村通和染坊");
            user.setCode("001000");
            user.setMobile("18180219917");
            user.setPassword("@5200192");
            user.setStatus(User.ENABLE_STATUS);
            user.setCreatedBy("Admin");
            user.setLastModifyBy("Admin");
            Date date = new Date();
            user.setCreatedDate(date);
            user.setLastModifyDate(date);
            user.setDeleted(false);
            user.setVersion(0);
            users.add(user);
        }
        userService.saveBatch(users);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void pageUser() {
        IPage<User> page = new Page<>();
        IPage<User> result = userService.page(page);
        System.out.println(result.getTotal());
        System.out.println(result.getSize());
        System.out.println(result.getCurrent());
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId("0000e082-9ff1-494f-b514-2e3900b5f031");
        user.setName("牟远强");
        user.setMobile("15855449035");
        int row = userService.updateUser(user);
        Assertions.assertEquals(1, row);
    }

    @Test
    public void loadEmployees() {
        System.out.println(employeeService.count());
        System.out.println(userService.count());
    }
}
