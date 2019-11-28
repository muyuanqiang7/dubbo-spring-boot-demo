package com.huiztech.muyq.dubbo.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huiztech.muyq.dubbo.provider.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/10 10:05]
 * @description []
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据状态查询用户信息
     *
     * @param status
     * @return
     */
    @Results(
            @Result(property = "loginName", column = "login_name")
    )
    @Select("SELECT * FROM user WHERE status = #{status}")
    List<User> findByStatus(@Param("status") int status);

    /**
     * 保存用户信息
     *
     * @param user
     */
    @Insert(value = "insert into user(id, name, login_name, code, address, password, mobile, status, last_modify_by, created_by, last_modify_date, created_date, deleted) VALUES " +
            "(#{id}, #{name}, #{loginName}, #{code}, #{address}, #{password}, #{mobile}, #{status}, #{lastModifyBy}, #{createdBy}, #{lastModifyDate}, #{createdDate}, #{deleted})")
    void saveUser(User user);
}
