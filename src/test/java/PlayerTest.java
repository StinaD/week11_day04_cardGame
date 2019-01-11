import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player();
        deck =  new Deck();
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player.getHandSize());
    }

//    @Test
//    public void playerReceivesCard(){
//        deck.populateDeck();
//        player.getCardFromDeck(deck);
//        assertEquals(1, player.getHandSize());
//    }
//
//    @Test
//    public void playerHasRankType(){
//        deck.populateDeck();
//        RankType rankType = player.displayCardRank(deck);
//        assertEquals(52, deck.getSize());
//        assertEquals(1, player.getHandSize());
//    }

}

//:TODO COMPARISON BETWEEN 2 CARDS - GAME MODEL ENUM FOR RESULT;
