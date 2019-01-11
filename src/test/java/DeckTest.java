import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsAtZero(){
        assertEquals(0, deck.getSize());
    }

    @Test
    public void cardsCanBeAddedToDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getSize());
    }

    @Test
    public void playerOneCardIsNotNull(){
        deck.populateDeck();
        deck.dealCardToPlayerOne();
        assertTrue(deck.playerOneCardStatus());
    }

    @Test
    public void playerTwoCardIsNotNull(){
        deck.populateDeck();
        deck.dealCardToPlayerTwo();
        assertTrue(deck.playerTwoCardStatus());
    }

    @Test
    public void canDetermineAGameWinner(){
        deck.populateDeck();
        deck.dealCardToPlayerOne();
        deck.dealCardToPlayerTwo();
        assertEquals("Player 1 wins!", deck.gameWinnerDetermined());
    }
}
