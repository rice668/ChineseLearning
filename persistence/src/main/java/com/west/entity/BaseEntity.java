package com.west.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangminglei on 2017/1/8.
 * Here is the detailed doc for @MappedSuperclass specifications and usages.
 * http://docs.oracle.com/javaee/5/api/javax/persistence/MappedSuperclass.html
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
  private Long id;
  private Integer version;
  private Date createdDate;
  private Date lastModified;

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getLastModified() {
    return lastModified;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }
}
