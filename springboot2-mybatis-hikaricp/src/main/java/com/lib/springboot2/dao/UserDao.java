package com.lib.springboot2.dao;

import com.lib.springboot2.domain.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wtx
 * @Date 2018/11/4 下午9:41
 */
@Mapper
public interface UserDao {
    int insert(UserDomain record);

    void deleteUserById(@Param("userId") Integer userId);

    void updateUser(UserDomain userDomain);

    List<UserDomain> selectUsers();
}
