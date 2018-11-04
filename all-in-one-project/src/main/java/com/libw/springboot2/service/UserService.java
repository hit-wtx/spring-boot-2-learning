package com.libw.springboot2.service;

import com.libw.springboot2.domain.UserDomain;

import java.util.List;

/**
 * @Author wtx
 * @Date 2018/11/4 下午9:48
 */
public interface UserService {
    int insert(UserDomain record);

    void deleteUserById(Integer userId);

    void updateUser(UserDomain userDomain);

    List<UserDomain> selectUsers();
}
