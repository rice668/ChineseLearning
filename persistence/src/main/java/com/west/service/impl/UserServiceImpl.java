package com.west.service.impl;

import com.west.dao.UserDao;
import com.west.entity.User;
import com.west.pojo.DataResult;
import com.west.pojo.Result;
import com.west.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangminglei on 2017/1/9.
 */
@Service
public class UserServiceImpl implements UserService {
  private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

  @Resource
  private UserDao userDao;

  @Transactional
  public void test() {
    User user = new User();
    user.setUsername("Garian");
    user.setPassword("7911233");
    user.setId(1l);
    user.setCreatedDate(new Date());
    userDao.save(user);
    if (true) {
      throw new RuntimeException();
    }
  }

  public Result login(String username, String password) {
    User user = userDao.findByUsername(username);
    if (user != null && user.getPassword().equals(password)) {
      return new DataResult<User>().setSuccess(true);
    }
    return new DataResult(false).setMsg("Your username and password do not match");
  }

  public Result addUser(User user) {
    userDao.save(user);
    return new Result(true);
  }

  public Result deleteUser(Long id) {
    userDao.delete(id);
    return new Result(true);
  }

  public Result resetPassword(Long id) {
    return null;
  }

  public String getUsernameById(Long id) {
    return userDao.getUsernameById(id);
  }

  public User findByUsername(String username) {
    return userDao.findByUsername(username);
  }

  public DataResult<List<User>> findAll() {
    return null;
  }
}
