package com.rhex.entity.records;

import com.rhex.contracts.Card;
import com.rhex.enums.Direction;
import com.rhex.enums.MinorArcanaCardType;
import com.rhex.enums.Rank;
import org.jetbrains.annotations.NotNull;

public record MinorArcanaCard(@NotNull MinorArcanaCardType minorArcana, @NotNull Rank rank, @NotNull String[] meaning) implements Card {
    public @NotNull String getName() {
        return String.format("%s of %s", rank.name(), minorArcana.name());
    }

    public @NotNull String getMeaning(Direction direction) {
        final int index = direction.ordinal();
        return meaning[index];
    }
}
