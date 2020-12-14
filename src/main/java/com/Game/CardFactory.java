package com.Game;

public class CardFactory {

    Card getCard(CardSuit suit, CardValue value){
        return new Card(suit, value);
    }
}
