package com.rhex.enums;

public enum Rank {
    Ace,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Page,
    Knight,
    Queen,
    King;

    public int getRank() {
        return this.ordinal() + 1;
    }
}
