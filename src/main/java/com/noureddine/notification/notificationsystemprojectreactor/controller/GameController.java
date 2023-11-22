package com.noureddine.notification.notificationsystemprojectreactor.controller;


import com.noureddine.notification.notificationsystemprojectreactor.entity.Game;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    private final Sinks.Many<Game> gameSink;

    private final Flux<Game> gameFlux;


    public GameController(Sinks.Many<Game> sink, Flux<Game> gameFlux) {
        this.gameSink = sink;
        this.gameFlux = gameFlux;
    }

    @PostMapping("/update")
    public Mono<Void> updateGame(@RequestBody Game game) {
        gameSink.tryEmitNext(game);
        return Mono.empty();
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Game> getGameUpdates() {
        return this.gameFlux;
    }
}
