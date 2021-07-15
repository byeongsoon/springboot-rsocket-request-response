package com.example.rsocketclient.controller;

import com.example.rsocketclient.model.entity.User;
import com.example.rsocketclient.model.newtwork.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserApiController {

  @Autowired
  private final RSocketRequester requester;

  @GetMapping("{id}")
  Mono<User> findOneUserById(@PathVariable Long id) {
    return this.requester
        .route("request-response")
        .data(new UserRequest(id))
//        .data(id) // Read 할땐 사실 id만 보내서 결과값 받아도 된다.
        .retrieveMono(User.class);
  }

}
