package com.vili.kata.bingo;

public class Card {
    private Prize prize;
    private int[][] structure;

    public Card(int[][] structure) {
        this.structure = structure;
    }


    public void check(BingoNumber bingoNumber) {
        throw new UnsupportedOperationException();
    }

    public static boolean hasPrize(Card card) {
        throw new UnsupportedOperationException();
    }

    public Prize getPrize() {
        throw new UnsupportedOperationException();
    }
}
