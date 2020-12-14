package Game;

public class Card {

    CardSuit suit;
    CardValue value;

    //Setters
    public void setSuit(CardSuit suit) { this.suit = suit; }
    public void setValue(CardValue value) { this.value = value; }

    //Getters
    public CardValue getValue() { return value; }
    public CardSuit getSuit() { return suit; }

    public Card(CardSuit suit, CardValue value){
        setSuit(suit);
        setValue(value);
    }
}
