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
        this.cards = cards;
        return ballsGenerator.generate()
                .timeout(Duration.ofSeconds(3L))
                .onErrorResume(TimeoutException.class, e -> Flux.just(BingoNumber.ERROR_NUMBER))
                .map(this::createBallWithNumber);

    }

    private Ball createBallWithNumber(BingoNumber bingoNumber) {
        cards.forEach(card -> card.check(bingoNumber));
        Optional<Card> prizedCard = cards.stream().filter(Card::hasPrize).findFirst();

        if(prizedCard.isPresent()){
            return new Ball(bingoNumber,prizedCard.get().getPrize(),prizedCard.get());
        } else {
            return new Ball(bingoNumber,Prize.NO_PRIZE,null);
        }

    }
}
