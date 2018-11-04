package com.libw.springboot2.service;

import com.libw.springboot2.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author wtx
 * @Date 2018/11/4 下午10:07
 */
@Primary
@Service
public class UserServiceJDBCImpl implements UserService {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Override
    public int insert(UserDomain record) {
        //jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)",record.getUserName(),rec);
        return 0;
    }

    @Override
    public void deleteUserById(Integer userId) {
        jdbcTemplate1.update("delete from USER where id = ?", userId);
    }

    @Override
    public void updateUser(UserDomain userDomain) {

    }

    @Override
    public List<UserDomain> selectUsers() {
        return Collections.emptyList();
    }
    // @Primary 用来指定两个bean 中的其中一个Primary
}
