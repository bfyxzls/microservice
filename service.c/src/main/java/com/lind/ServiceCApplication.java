package com.lind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ServiceCApplication {
  public static void main(String[] args) {
    SpringApplication.run(ServiceCApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello C service!";
  }
}