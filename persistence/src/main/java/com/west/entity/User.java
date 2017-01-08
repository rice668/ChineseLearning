package com.west.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zhangminglei on 2017/1/8.
 */
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
