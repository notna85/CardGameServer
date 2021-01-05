package com.Game;

import com.CardGameServer.Player;
import com.Cardfactory.Card;

import java.util.List;

public interface CardPlayable {
    void setCardHand(List<Card> cardHand);
    List<Card> getCardHand();

    void setCardOwner(Player cardOwner);
    Player getCardOwner();
}
