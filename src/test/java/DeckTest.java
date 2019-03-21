import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();


    }

    @Test
    public void deckHasCards() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard() {
        Card card = deck.dealOne();
        assertEquals(51, deck.countCards());
    }

    @Test
    public void isCardUnrandom() {
        Card card = deck.dealOne();
        assertEquals(SuitType.HEARTS, card.getSuit());
       assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void deckShuffle() {
        deck.shuffle();
        Card card = deck.dealOne();
        assertNotEquals(SuitType.HEARTS, card.getSuit());
        assertNotEquals(RankType.ACE, card.getRank());
    }



    }

