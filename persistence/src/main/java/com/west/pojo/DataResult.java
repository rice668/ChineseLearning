package com.west.pojo;

/**
 * Created by zhangminglei on 2017/1/9.
 */
public class DataResult<T> extends Result {
  private T data;

  public DataResult() {
  }

  public DataResult(T data) {
    this.data = data;
  }

  public DataResult(boolean success, T data) {
    super(success);
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public DataResult setData(T data) {
    this.data = data;
    return this;
  }
}
