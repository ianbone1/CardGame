import com.sun.deploy.net.CrossDomainXML;

import java.util.ArrayList;

public class Hand {


    private String name;
    private ArrayList<Card> cards;

    public Hand(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();


    }

    public String getName() {
        return this.name;
    }

    public int countCards() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int total() {
        int total = 0;
        for  (Card card: this.cards){
            total += card.getValueFromEnum();
        }
        return total;
    }
}
