package com.west.dao;
import com.west.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by zhangminglei on 2017/1/9.
 */
public interface UserDao extends JpaRepository<User, Long>,
        JpaSpecificationExecutor<User> {

    User findByUsername(String username);

    String getUsernameById(Long id);

}
