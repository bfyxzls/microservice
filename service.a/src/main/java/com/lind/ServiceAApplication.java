package com.lind;

import com.lind.feign.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableFeignClients
public class ServiceAApplication {
  @Autowired
  ServiceBClient serviceBClient;

  public static void main(String[] args) {
    SpringApplication.run(ServiceAApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello A service!";
  }

  @GetMapping("/mock")
  public String mock() {
    return hello() + serviceBClient.mock();
  }
}

