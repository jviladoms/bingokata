package com.vili.kata.bingo;

import reactor.core.publisher.Flux;

public interface BallsGenerator {
    Flux<BingoNumber> generate();
}
