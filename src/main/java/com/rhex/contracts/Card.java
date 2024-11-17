package com.rhex.contracts;

import com.rhex.enums.Direction;
import org.jetbrains.annotations.NotNull;

public interface Card {
    @NotNull String getName();
    @NotNull String getMeaning(Direction direction);
}
