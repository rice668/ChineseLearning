package com.west.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zhangminglei on 2017/2/1.
 */
@Entity
@Table(name="USER")
public class User {

  @Column(name="username")
  private String username;

  @Column(name = "password")
  private String password;

  public User() {
    super();
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

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




