package com.lib.springboot2.repository;

import com.lib.springboot2.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author wtx
 * @Date 2018/11/4 下午10:57
 */
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
