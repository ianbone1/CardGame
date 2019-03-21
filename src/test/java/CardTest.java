import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() {
        card = new Card(SuitType.HEARTS, RankType.ACE);

    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void CanGetValueFromCard() {
        assertEquals(1, card.getValueFromEnum());
    }



//    SuitType[] suits = SuitType.values();

    //    @Test
//    public void canBeMisspelt(){
//        card = new Card("Heearts");
//        assertEquals("Heearts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}
