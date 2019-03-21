import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Deck deck;
    Game game;
    ArrayList<String> players;


    @Before
    public void setup() {
        deck = new Deck();
        players = new ArrayList<String>();
        players.add("Ian");
        players.add("Neil");
        players.add("James");
        players.add("Eloise");
        game = new Game(players);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(4, game.playerCount());
    }

    @Test
    public void gameCanDeal() {
        game.deal(deck);
        assertEquals(44, deck.countCards());

    }

    @Test
    public void identifyWinner() {
        game.deal(deck);
        Hand winner = game.getWinner();
        System.out.println(winner.getName());
        assertNotNull(winner);
    }
}
