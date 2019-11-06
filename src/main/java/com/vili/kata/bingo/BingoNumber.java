package com.vili.kata.bingo;

public class BingoNumber {
    private final Integer number;

    public final static BingoNumber ERROR_NUMBER = new BingoNumber(99);

    public BingoNumber(Integer number) {
        this.number = number;
    }
}
