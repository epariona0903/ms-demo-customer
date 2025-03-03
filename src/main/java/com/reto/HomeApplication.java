package com.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeApplication {

  public static void main(String[] args) {
    new SpringApplication(HomeApplication.class).run(args);
  }

}
