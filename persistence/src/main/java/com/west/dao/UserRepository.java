package com.west.dao;

import com.west.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangminglei on 2017/1/29.
 */
@Repository
public class UserRepository {

  @Autowired
  private SessionFactory sessionFactory;

  public User addUser(User user) {
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(user);
    return user;
  }

}
