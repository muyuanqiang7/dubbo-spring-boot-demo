package com.huiztech.muyq.dubbo.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huiztech.muyq.dubbo.provider.domain.User;

import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/10 10:49]
 * @description []
 */
public interface IUserService extends IService<User> {
    /**
     * 通过status查询用户信息
     *
     * @param status
     * @return
     */
    List<User> findByStatus(int status);

    /**
     * 保存用户信息
     *
     * @param user
     */
    void saveUser(User user);

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    List<User> findAllUser();

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);
}
