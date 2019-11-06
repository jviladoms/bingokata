package com.vili.kata.bingo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import reactor.test.StepVerifier;

import java.util.List;

public class BingoGameTest {


    private BingoGame bingoGame;
    private List<Card> cards;
    
    @Mock
    private BallsGenerator ballsGenerator;

       private Ball ball1;
       private Ball ball2;
       private Ball ball3;
       private Ball ball4;
       private Ball ball5;
       private Ball ball6;
       private Ball ball7;
       private Ball ball8;
       private Ball ball9;
       private Card card;


    @BeforeEach
    void setUp() {

        ball1 = new Ball(new BingoNumber(1),Prize.NO_PRIZE,null);
        ball2 = new Ball(new BingoNumber(2),Prize.NO_PRIZE,null);
        ball3 = new Ball(new BingoNumber(3),Prize.NO_PRIZE,null);
        ball4 = new Ball(new BingoNumber(4),Prize.LINE,null);
        ball5 = new Ball(new BingoNumber(5),Prize.NO_PRIZE,null);
        ball6 = new Ball(new BingoNumber(6),Prize.NO_PRIZE,null);
        ball7 = new Ball(new BingoNumber(7),Prize.NO_PRIZE,null);
        ball8 = new Ball(new BingoNumber(8),Prize.NO_PRIZE,null);
        ball9 = new Ball(new BingoNumber(9),Prize.BINGO,null);

        int[][] structure =  new int[2][3];
        structure[0][0] = 1;
        structure[0][1] = 2;
        structure[0][2] = 4;
        structure[1][0] = 5;
        structure[1][1] = 6;
        structure[1][2] = 9;

        card = new Card(structure);
        cards.add(card);
        bingoGame = new BingoGame(ballsGenerator);
    }

    @Test
    void play_bingo_game_with_9_balls(){
       StepVerifier.create(bingoGame.playGame(cards))
                        .expectNext(ball1)
                        .expectNext(ball2)
                        .expectNext(ball3)
                        .expectNext(ball4)
                        .expectNext(ball5)
                        .expectNext(ball6)
                        .expectNext(ball7)
                        .expectNext(ball8)
                        .expectNext(ball9)
                        .verifyComplete();
    }
}
