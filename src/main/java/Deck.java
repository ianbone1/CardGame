import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        Card card;
        this.deck = new ArrayList<Card>();
        for( SuitType suit: SuitType.values()){
            for ( RankType rank: RankType.values()){
                card = new Card(suit, rank);
                this.deck.add(card);
            }
        }

    }
    public int countCards(){
        return this.deck.size();
    }

    public Card dealOne() {
        return this.deck.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}
