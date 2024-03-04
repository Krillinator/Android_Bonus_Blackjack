package com.example.bonus_blackjack

import com.example.bonus_blackjack.models.Card
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    // ♠ ♥ ♦ ♣

    @Test
    fun createCardTest() {

        val myCard = Card("Spades ♠", "5")

        assertEquals("5", myCard.getValue())
        assertEquals("Spades ♠", myCard.getSuit())
        assertNotEquals(null, myCard.getValue())
        assertNotEquals(null, myCard.getSuit())
        assertNotNull(myCard)

        println(myCard)
    }

    @Test
    fun createDeckOfCards() {

        // Create DECK OF CARDS
        // 52 Cards in Total
        // Iterations (AKA For Loop) DRY

        // TODO - How do we create 52 UNIQUE cards?
        // TODO - How to add the correct VALUE & SUIT

        /* TODO - Information
        * -------------
        * -- 1 = ACE --
        * -------------
        * */

        // TODO - MutableListOf VS Arraylist
        val deckOfCards = mutableListOf<Card>()
        val valueList = mutableListOf("2", "3", "4", "5")
        val suit = mutableListOf("HEARTS", "SPADES", "CLUBS", "DIAMONDS")
        // for (value in valueList) { }

        

        for (i in 1..4) {
            println(i)

            for (j in 1..13) {
                println("Suit: $i, Value: $j")

                val card = Card("$i", "$j")
                println(card)

                deckOfCards.add(card)
            }
        }

        // We're done at this point! :)
        println(deckOfCards)
        deckOfCards.shuffle()
        println(deckOfCards)

        // TODO - Within For Loop - Find the value of 1, 11, 12, 13
        // TODO - THEN, use when()

    }

}