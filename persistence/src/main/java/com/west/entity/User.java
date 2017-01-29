package com.west.entity;

import javax.persistence.*;

/**
 * Created by zhangminglei on 2017/1/8.
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity {

  @Column(name = "username")
  private String username;
  @Column(name = "password")
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
