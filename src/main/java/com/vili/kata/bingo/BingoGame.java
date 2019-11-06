package com.vili.kata.bingo;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

public class BingoGame {

    private BallsGenerator ballsGenerator;
    private Balls balls;
    private List<Card> cards;

    public BingoGame(BallsGenerator ballsGenerator) {
        this.ballsGenerator = ballsGenerator;
    }

    public Flux<Ball> playGame(List<Card> cards) {
        throw new UnsupportedOperationException();
    }

}
