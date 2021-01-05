package com.Cardfactory;

import com.AbstractFactory.Createable;

public class CardFactory implements Createable{

    Card getCard(CardSuit suit, CardValue value){
        return new Card(suit, value);
    }

    @Override
    public Createable create() {
        return null;
    }
}
