
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    public Hand hand1;
    public Hand hand2;
    public Deck deck;

    @Before
    public void setup(){
        hand1 = new Hand("Neil");
        hand2 = new Hand("Ian");
        deck = new Deck();

    }

    @Test
    public void handHasName() {
        assertEquals("Neil", hand1.getName());
    }
    @Test
    public void canCountCards(){
        assertEquals(0, hand1.countCards());
    }

    @Test
    public void canAddCard() {
        hand1.addCard(deck.dealOne());
        assertEquals(1, hand1.countCards());
    }

    @Test
    public void totalCards() {
        hand1.addCard(deck.dealOne());
        hand1.addCard(deck.dealOne());
        assertEquals(3, hand1.total());
    }
}
