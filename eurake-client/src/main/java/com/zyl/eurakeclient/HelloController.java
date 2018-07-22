package com.zyl.eurakeclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  private final Logger logger = LoggerFactory.getLogger(HelloController.class);

  private final RestTemplate restTemplate;

  @Autowired
  public HelloController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String index() {

    ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://db-service/world",
        String.class);
    return "hello" + responseEntity.getBody();
  }

}
