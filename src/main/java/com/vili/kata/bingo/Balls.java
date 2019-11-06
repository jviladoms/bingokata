package com.vili.kata.bingo;

@FunctionalInterface
public interface Balls {
    Ball createBallWithNumber(BingoNumber bingoNumber);
}

