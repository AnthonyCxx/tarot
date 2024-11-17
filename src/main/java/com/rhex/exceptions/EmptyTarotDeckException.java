package com.rhex.exceptions;

public class EmptyTarotDeckException extends RuntimeException {
    private static final String EXCEPTION_MESSAGE = "Cannot draw a card from an empty deck; please reset the deck";

    public EmptyTarotDeckException() {
        super(EXCEPTION_MESSAGE);
    }
}
