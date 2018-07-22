package com.zyl.dbservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final Logger logger = LoggerFactory.getLogger(TestController.class);

  @RequestMapping(value = "/world", method = RequestMethod.GET)
  public String index() {
    logger.info("TestController  index");
    return " world";
  }
}
