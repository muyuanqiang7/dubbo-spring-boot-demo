package com.huiztech.muyq.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huiztech.muyq.dubbo.provider.domain.User;
import com.huiztech.muyq.dubbo.provider.mapper.UserMapper;
import com.huiztech.muyq.dubbo.provider.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/10 10:51]
 * @description []
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findByStatus(int status) {
        return userMapper.findByStatus(status);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return userMapper.selectList(null);
    }

    /**
     * 保存用户
     *
     * @param user
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUser(User user) {
        return userMapper.updateById(user);
    }
}
