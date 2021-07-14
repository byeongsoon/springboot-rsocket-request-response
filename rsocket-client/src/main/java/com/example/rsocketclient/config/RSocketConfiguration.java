package com.example.rsocketclient.config;

import io.rsocket.RSocket;
import io.rsocket.core.RSocketConnector;
import io.rsocket.transport.netty.client.TcpClientTransport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;

@Slf4j
@Configuration
public class RSocketConfiguration {

  @Bean
  RSocketRequester rSocketRequester(RSocketStrategies strategies) {

    InetSocketAddress address = new InetSocketAddress("localhost",7000);

    Mono<RSocket> rSocketConnector = RSocketConnector.connectWith(TcpClientTransport.create(address));

    return RSocketRequester.builder()
        .rsocketStrategies(strategies)
        .tcp("localhost",7000);

  }

}
