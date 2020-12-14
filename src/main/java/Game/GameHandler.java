package Game;

import com.CardGameServer.Player;

import java.util.ArrayList;
import java.util.List;

public class GameHandler {

    List<Player> players;
    GameFactory gameFactory;


    public void createGame(){
        gameFactory = new GameFactory();

        SkitGubbeGame game = gameFactory.getSkitGubbeGame();
    }
}
