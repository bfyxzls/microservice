package com.lind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicec", fallback = ServiceCClientFallback.class)
public interface ServiceCClient {

  @GetMapping("/hello")
  String hello();
}
