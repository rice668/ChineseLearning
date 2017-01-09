package com.west.pojo;

/**
 * Created by zhangminglei on 2017/1/9.
 */
public class Result {
  private String title;
  private String msg;
  private boolean success = true;
  private int errCode;

  public Result() {
    super();
  }

  public Result(String title, String msg, boolean success) {
    this.title = title;
    this.msg = msg;
    this.success = success;
  }

  public Result(String msg, boolean success) {
    super();
    this.msg = msg;
    this.success = success;
  }

  public Result(boolean success) {
    super();
    this.success = success;
  }

  public Result logErrorMsg(String msg) {
    this.success = false;
    this.msg = msg;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Result setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getMsg() {
    return msg;
  }

  public Result setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public boolean isSuccess() {
    return success;
  }

  public Result setSuccess(boolean success) {
    this.success = success;
    return this;
  }

  public int getErrCode() {
    return errCode;
  }

  public Result setErrCode(int errCode) {
    this.errCode = errCode;
    return this;
  }
}
