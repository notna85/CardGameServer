package com.Game;

public class Card {

    CardSuit suit;
    CardValue value;

    //Setters
    void setSuit(CardSuit suit) { this.suit = suit; }
    void setValue(CardValue value) { this.value = value; }

    //Getters
    CardValue getValue() { return value; }
    CardSuit getSuit() { return suit; }

    Card(CardSuit suit, CardValue value){
        setSuit(suit);
        setValue(value);
    }
}
