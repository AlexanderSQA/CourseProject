package com.otus.services;

import com.otus.dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  @Bean
  public UserDto getUser() {
    return new UserDto();
  }

}
