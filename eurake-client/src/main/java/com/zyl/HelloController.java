package com.zyl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  private final Logger logger = LoggerFactory.getLogger(HelloController.class);

  private final RestTemplate restTemplate;

  private final FeiClient feiClient;


  @Autowired
  public HelloController(RestTemplate restTemplate, FeiClient feiClient) {
    this.restTemplate = restTemplate;
    this.feiClient = feiClient;
  }

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String index() {

    ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://db-service/world",
        String.class);
    logger.info("Ribion: {}", "hello" + responseEntity.getBody());
    logger.info("Fein: {}", "hello" + feiClient.hello());
    return "--";
  }

}
