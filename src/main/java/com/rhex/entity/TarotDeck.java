package com.rhex.entity;

import com.rhex.contracts.Card;
import com.rhex.entity.registries.MajorArcanaRegistry;
import com.rhex.entity.registries.MinorArcanaRegistry;
import com.rhex.enums.Direction;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TarotDeck {
    private static final Random RANDOM = new Random();
    private static final ArrayList<Card> CARDS = Stream.concat(
            MajorArcanaRegistry.CARDS.stream(),
            MinorArcanaRegistry.CARDS.stream()
    ).collect(Collectors.toCollection(ArrayList::new));

     private ArrayList<Card> deck;


    public TarotDeck() {
        reset();
    }

    public Optional<Pair<Card,Direction>> drawCard() {
        if (deck.isEmpty()) {
            return Optional.empty();
        }

        final Card card = deck.removeFirst();
        final Direction direction = Direction.values()[RANDOM.nextInt(Direction.values().length)];

        return Optional.of(
                Pair.with(card, direction)
        );
    }

    public void reset() {
        deck = new ArrayList<Card>(CARDS);
        Collections.shuffle(deck, RANDOM);
    }
}
