package com.lind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
public class HystrixMonitorApplication {
  public static void main(String[] args) {


    SpringApplication.run(HystrixMonitorApplication.class, args);
  }

}

