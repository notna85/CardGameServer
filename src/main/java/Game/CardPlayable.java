package Game;

import com.CardGameServer.Player;

import java.util.ArrayList;
import java.util.List;

public interface CardPlayable {
    void setCardHand(List<Card> cardHand);
    List<Card> getCardHand();

    void setCardOwner(Player cardOwner);
    Player getCardOwner();
}
