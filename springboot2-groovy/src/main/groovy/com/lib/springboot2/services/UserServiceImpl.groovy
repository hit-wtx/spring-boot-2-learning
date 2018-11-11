package com.lib.springboot2.services

import com.lib.springboot2.domain.User
import org.springframework.stereotype.Service

/**
 * @Author w
 x
 * @Date 2018/11/5 上午8:
 8
 */
@Service("userService")
class UserServiceImpl implements UserService {
    @Override
    User getInfoByName(String name) {
        return new User(1, "wtx", "188####")
    }
}
