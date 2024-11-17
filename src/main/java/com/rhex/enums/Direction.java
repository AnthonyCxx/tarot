package com.rhex.enums;

import org.jetbrains.annotations.NotNull;

public enum Direction {
    Upright("Upright"),
    Reversed("Reversed");

    private final @NotNull String text;

    Direction(@NotNull String text) {
        this.text = text;
    }

    public @NotNull String getText() {
        return text;
    }
}
