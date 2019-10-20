package com.lind.feign;

import org.springframework.stereotype.Component;

@Component
public class ServiceBClientFallback implements ServiceBClient {

  @Override
  public String mock() {
    return "B链路问题，返回默认值";
  }
}