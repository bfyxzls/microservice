package com.lind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceb", fallback = ServiceBClientFallback.class)
public interface ServiceBClient {

  @GetMapping("/mock")
  String mock();
}
