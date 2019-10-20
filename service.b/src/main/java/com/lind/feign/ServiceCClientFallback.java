package com.lind.feign;

import org.springframework.stereotype.Component;

@Component
public class ServiceCClientFallback implements ServiceCClient {

  @Override
  public String hello() {
    return "C链路问题，返回默认值";
  }
}