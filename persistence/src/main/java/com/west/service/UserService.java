package com.west.service;

import com.west.dao.UserRepository;
import com.west.entity.User;
import com.west.pojo.DataResult;
import com.west.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangminglei on 2017/1/9.
 */
@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  @Transactional
  public void addUser(User user) {
    userRepository.addUser(user);
  }

}
