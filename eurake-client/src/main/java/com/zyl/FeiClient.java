package com.zyl;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.openfeign.FeignClient("user-service")
public interface FeiClient {

  @RequestMapping(value = "/world", method = RequestMethod.GET)
  public String hello();

}
