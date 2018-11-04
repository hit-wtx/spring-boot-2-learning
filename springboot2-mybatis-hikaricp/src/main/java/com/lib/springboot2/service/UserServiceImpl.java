package com.lib.springboot2.service;

import com.lib.springboot2.dao.UserDao;
import com.lib.springboot2.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wtx
 * @Date 2018/11/4 下午9:47
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public int insert(UserDomain record) {
        return userDao.insert(record);
    }

    @Override
    public void deleteUserById(Integer userId) {
        userDao.deleteUserById(userId);
    }

    @Override
    public void updateUser(UserDomain userDomain) {
        userDao.updateUser(userDomain);
    }

    @Override
    public List<UserDomain> selectUsers() {
        return userDao.selectUsers();
    }
}
