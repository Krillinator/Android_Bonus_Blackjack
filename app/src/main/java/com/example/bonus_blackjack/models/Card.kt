package com.example.bonus_blackjack.models

// TODO - Check the 'value' in the future
class Card(
    private val suit: String,
    private val value: String
) {

    fun getValue(): String {
        return value
    }

    fun getSuit(): String {
        return suit
    }

    override fun toString(): String {
        return "Card(suit='$suit', value='$value')"
    }


}