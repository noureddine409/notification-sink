package com.noureddine.notification.notificationsystemprojectreactor.config;


import com.noureddine.notification.notificationsystemprojectreactor.entity.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Configuration
public class SinkConfig {
    @Bean
    public Sinks.Many<Game> sink() {
        return Sinks.many().replay().limit(1);
    }

    @Bean
    public Flux<Game> gameBroadcast(Sinks.Many<Game> sink) {
        return sink.asFlux();
    }
}
