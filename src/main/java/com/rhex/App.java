package com.rhex;

import com.rhex.contracts.Card;
import com.rhex.entity.TarotDeck;
import com.rhex.enums.Direction;
import com.rhex.exceptions.EmptyTarotDeckException;
import org.javatuples.Pair;

public class App
{
    public static void main(String[] arguments)
    {
        if (arguments.length != 1) {
            System.out.println("Usage: java -jar tarot.jar <number of cards to draw>");
            System.exit(1);
        }

        final int numberOfCardsToDraw = Integer.parseInt(arguments[0]);
        final TarotDeck tarotDeck = new TarotDeck();

        for (int i = 0; i < numberOfCardsToDraw; ++i)
        {
            final Pair<Card, Direction> drawing = tarotDeck.drawCard().orElseThrow(EmptyTarotDeckException::new);
            final Card card = drawing.getValue0();
            final Direction direction = drawing.getValue1();

            System.out.format("%s %s - %s" + System.lineSeparator(), card.getName(), direction.getText(), card.getMeaning(direction));
        }
    }
}
