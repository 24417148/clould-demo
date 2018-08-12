package com.zyl.user.controller;

import com.zyl.user.repository.entity.User;
import com.zyl.user.service.UserService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public String user(@PathVariable String id) {
    User user = userService.getUser("1");
    logger.info("------- find user : {}", user.getUserName()+user.getAccount());
    return user.getUserName();

  }
}
