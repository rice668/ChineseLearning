package com.west.service;

import com.west.entity.User;
import com.west.pojo.DataResult;
import com.west.pojo.Result;

import java.util.List;

/**
 * Created by zhangminglei on 2017/1/9.
 */
public interface UserService {

  Result login(String username, String password);

  Result addUser(User user);

  Result deleteUser(Long id);

  Result resetPassword(Long id);

  String getUsernameById(Long id);

  User findByUsername(String username);

  DataResult<List<User>> findAll();

}
