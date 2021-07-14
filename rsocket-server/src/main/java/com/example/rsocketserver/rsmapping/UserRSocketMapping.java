package com.example.rsocketserver.rsmapping;

import com.example.rsocketserver.model.entity.User;
import com.example.rsocketserver.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class UserRSocketMapping {

  @Autowired
  private UserApiLogicService userApiLogicService;

  @MessageMapping("request-response")
  User getUser(User user) {
    log.info("MessageMapping TEST");
    return userApiLogicService.read(user.getId());
  }

}
