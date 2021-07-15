package com.example.rsocketserver.rsmapping;

import com.example.rsocketserver.model.entity.User;
import com.example.rsocketserver.model.network.UserRequest;
import com.example.rsocketserver.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class UserRSocketMapping {

  @Autowired
  private UserApiLogicService userApiLogicService;

  @MessageMapping("request-response")
  Mono<User> getUser(UserRequest request) {
//  Mono<User> getUser(Long id) {
    return userApiLogicService.read(request.getId());
//    return userApiLogicService.read(id);
  }

}
