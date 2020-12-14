package Game;

import com.CardGameServer.Player;

import java.util.ArrayList;
import java.util.List;

public class SkitGubbePlayerCards implements CardPlayable{

    List<Card> cardHand = new ArrayList<>();
    List<Card> cardsOpen;
    List<Card> cardsDown;
    Player cardOwner;

    //Setters
    @Override
    public void setCardHand(List<Card> cardHand) { this.cardHand = cardHand; }
    public void setCardsOpen(List<Card> cardsOpen) { this.cardsOpen = cardsOpen; }
    public void setCardsDown(List<Card> cardsDown) { this.cardsDown = cardsDown; }
    @Override
    public void setCardOwner(Player cardOwner) { this.cardOwner = cardOwner; }

    //Getters
    @Override
    public List<Card> getCardHand() { return cardHand; }
    public List<Card> getCardsOpen() { return cardsOpen; }
    public List<Card> getCardsDown() { return cardsDown; }
    @Override
    public Player getCardOwner() { return cardOwner; }
}
