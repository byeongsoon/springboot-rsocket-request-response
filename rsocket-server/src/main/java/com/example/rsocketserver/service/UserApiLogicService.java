package com.example.rsocketserver.service;

import com.example.rsocketserver.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserApiLogicService {

  public User read(Long id) {
    return User.builder()
        .id(1L)
        .name("jang")
        .address("서울시")
        .build();
  }

}
