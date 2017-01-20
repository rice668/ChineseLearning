package com.west.service.impl;

import com.west.dao.UserRepository;
import com.west.entity.User;
import com.west.pojo.DataResult;
import com.west.pojo.Result;
import com.west.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhangminglei on 2017/1/9.
 */
@Service
public class UserServiceImpl implements UserService {
  private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

  @Resource
  private UserRepository userRepository;

  @Transactional
  @Test
  public void test() {
    User user = new User();
    user.setUsername("tom");
    userRepository.save(user);
    assertEquals(user, userRepository.findByUsername("tom"));
  }


  public Result login(String username, String password) {
    User user = userRepository.findByUsername(username);
    if (user != null && user.getPassword().equals(password)) {
      return new DataResult<User>().setSuccess(true);
    }
    return new DataResult(false).setMsg("Your username and password do not match");
  }

  public Result addUser(User user) {
    userRepository.save(user);
    return new Result(true);
  }

  public Result deleteUser(Long id) {
    userRepository.delete(id);
    return new Result(true);
  }

  public Result resetPassword(Long id) {
    return null;
  }

  public String getUsernameById(Long id) {
    return userRepository.getUsernameById(id);
  }

  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public DataResult<List<User>> findAll() {
    return null;
  }
}
