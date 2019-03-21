import org.junit.Before;

import java.util.ArrayList;

public class Runer {

    public static void main(String[] args) {
        Deck deck;
        Game game;
        ArrayList<String> players;
        Hand winner;


            deck = new Deck();
            players = new ArrayList<String>();
            players.add("Ian");
            players.add("Neil");
            players.add("James");
            players.add("Eloise");
            game = new Game(players);
            game.deal(deck);
            winner = game.getWinner();

            System.out.println(winner.getName());

        }


    }

