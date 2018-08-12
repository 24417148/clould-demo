package com.zyl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

@Service
public class HystrixService {

  @HystrixCommand(fallbackMethod = "fallBack")
  public String springCloud() throws Exception {
    if (RandomUtils.nextInt() % 2 == 0) {
      throw new Exception("exception");
    }
    return "springCloud";
  }

  public String fallBack() {
    return "HystrixService fallBack()";
  }

}
