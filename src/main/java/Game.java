import java.util.ArrayList;

public class Game {
    private ArrayList<Hand> players;

    public Game(ArrayList<String> playerList) {
        this.players = new ArrayList<Hand>();
        for(String playerName: playerList){
            this.players.add(new Hand(playerName));
        }
    }

    public int playerCount() {
        return this.players.size();
    }

    public void deal(Deck deck) {
        deck.shuffle();
        for(Hand player: this.players){
            player.addCard(deck.dealOne());
            player.addCard(deck.dealOne());
        }
    }

    public Hand getWinner() {
        Hand winner = new Hand("dummy");
        for (Hand player: this.players){
            if (player.total() > winner.total()) {
                winner = player;
            }
        }
        return winner;
    }
}
