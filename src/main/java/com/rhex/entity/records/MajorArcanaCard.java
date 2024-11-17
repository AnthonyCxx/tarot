package com.rhex.entity.records;

import com.rhex.contracts.Card;
import com.rhex.enums.Direction;
import com.rhex.enums.MajorArcanaCardType;
import org.jetbrains.annotations.NotNull;

public record MajorArcanaCard(@NotNull MajorArcanaCardType majorArcanaCardType, @NotNull String name, @NotNull String[] meaning) implements Card {
    public @NotNull String getName() {
        return name;
    }

    public int getRank() {
        return majorArcanaCardType.ordinal();
    }

    public @NotNull String getMeaning(Direction direction) {
        final int index = direction.ordinal();
        return meaning[index];
    }
}
