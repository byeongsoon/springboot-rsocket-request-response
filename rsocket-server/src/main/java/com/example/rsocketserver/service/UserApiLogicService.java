package com.example.rsocketserver.service;

import com.example.rsocketserver.model.entity.User;
import com.example.rsocketserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserApiLogicService {

  @Autowired
  private UserRepository userRepository;

  public Mono<User> read(Long id) {
    return Mono.just(
        User.builder()
        .id(id)
        .name("Byeongsoon")
        .address("용인시 역북동")
        .build()
    );
  }

}
