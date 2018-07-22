package com.zyl.eurakeservernode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakeServerNode1Application {

  public static void main(String[] args) {
    SpringApplication.run(EurakeServerNode1Application.class, args);
  }
}
