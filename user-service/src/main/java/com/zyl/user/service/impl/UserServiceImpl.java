package com.zyl.user.service.impl;

import com.zyl.user.repository.UserDao;
import com.zyl.user.repository.entity.User;
import com.zyl.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


  @Autowired
  private UserDao userDao;

  @Override
  public User getUser(String id) {
    System.out.println("111111111111111111111"+userDao.getUser(id).getAccount());
    return userDao.getUser(id);
  }


}
