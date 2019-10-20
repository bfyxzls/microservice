package com.lind;

import com.lind.entity.User;
import com.lind.feign.ServiceCClient;
import com.lind.repository.UserRepository;
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
public class ServiceBApplication {
  @Autowired
  ServiceCClient serviceCClient;

  @Autowired
  UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(ServiceBApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello B service!";
  }

  @GetMapping("/mock")
  public String mock() {
    User user = new User();
    user.setDescription("test");
    user.setTitle("zzl");
    userRepository.save(user);
    return hello() + serviceCClient.hello();
  }
}