package com.vili.kata.bingo;


public class Ball {
    public static final Ball ERROR_BALL = new Ball(new BingoNumber(99),Prize.NO_PRIZE,null);
    private BingoNumber number;
    private Prize prize;
    private Card card;

    public Ball(BingoNumber number, Prize prize, Card card) {
        this.number = number;
        this.prize = prize;
        this.card = card;
    }
}
