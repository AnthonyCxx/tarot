package com.rhex.entity.registries;

import com.rhex.entity.records.MajorArcanaCard;
import com.rhex.enums.MajorArcanaCardType;

import java.util.List;

public final class MajorArcanaRegistry {
    public static final List<MajorArcanaCard> CARDS = List.of(
            new MajorArcanaCard(
                    MajorArcanaCardType.Fool, "The Fool",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Magician, "The Magician",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.HighPriestess, "The High Priestess",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Empress, "The Empress", 
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Emperor, "The Emperor", 
                    new String[] { "upright", "reversed" }),

            new MajorArcanaCard(
                    MajorArcanaCardType.Hierophant, "The Hierophant", 
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Lovers, "The Lovers",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Chariot, "The Chariot",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Strength, "Strength",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Hermit, "The Hermit",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.WheelOfFortune, "The Wheel of Fortune",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Justice, "Justice",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.HangedMan, "The Hanged Man",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Death, "Death",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Temperance, "Temperance",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Devil, "The Devil",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Tower, "The Tower",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Star, "The Star",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Moon, "The Moon",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Sun, "The Sun",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.Judgement, "Judgement",
                    new String[] { "upright", "reversed" }
            ),

            new MajorArcanaCard(
                    MajorArcanaCardType.World, "The World",
                    new String[] { "upright", "reversed" }
            )
    );
}
