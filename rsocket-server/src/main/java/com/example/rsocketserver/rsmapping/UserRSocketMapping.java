package com.example.rsocketserver.rsmapping;

import com.example.rsocketserver.model.entity.User;
import com.example.rsocketserver.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;

public class UserRSocketMapping {

  @Autowired
  private UserApiLogicService userApiLogicService;

  @MessageMapping("request-response")
  User getUser(Long id) {
    return userApiLogicService.read(id);
  }

}
