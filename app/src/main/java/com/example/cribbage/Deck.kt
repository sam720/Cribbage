package com.example.cribbage

abstract class Deck {
    private val cards : List<Card> = createDeck()

    fun createDeck() : List<Card>  {
        val cards = mutableListOf<Card>()
        Suit.values().iterator().forEach {
            for (i in 1..13) {
                cards.add(Card(i, it))
            }
        }
        return cards
    }
}
