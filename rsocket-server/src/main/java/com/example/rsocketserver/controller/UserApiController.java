package com.example.rsocketserver.controller;

import com.example.rsocketserver.model.entity.User;
import com.example.rsocketserver.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/user")
public class UserApiController {

  @Autowired
  private UserApiLogicService userApiLogicService;

  @GetMapping("{id}")
  public User read(@PathVariable Long id) {
    return userApiLogicService.read(id);
  }

}
