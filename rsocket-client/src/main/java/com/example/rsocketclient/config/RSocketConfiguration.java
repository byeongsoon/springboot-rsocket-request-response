package com.example.rsocketclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;


@Configuration
public class RSocketConfiguration {

  @Bean
  RSocketRequester rSocketRequester(RSocketStrategies strategies) {
    return RSocketRequester.builder()
        .rsocketStrategies(strategies)
        .tcp("localhost",7000);
  }

}
