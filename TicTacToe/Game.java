import java.util.List;
import java.util.ArrayList;

public class Game {
    Board board;
    List<Player> players = new ArrayList();

    Game(Player playerA, Player playerB)
    {
        this.board = new Board();
        players.add(playerA);
        players.add(playerB);
    }
}
