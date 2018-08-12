package com.zyl.user.repository.entity;

public class User {

  private int id;

  private String userId;

  private String account;

  private String userName;

  private String password;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getAccount() {
    return account;
  }

  public String getPassword() {
    return password;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}

