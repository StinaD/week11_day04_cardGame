import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playerHand;

    public Player(){
        this.playerHand = new ArrayList<>();
    }

    public int getHandSize(){
        return this.playerHand.size();
    }

//    public void getCardFromDeck(Deck deck){
//        Card newCard = deck.dealCard();
//        this.playerHand.add(newCard);
//    }

//    public RankType displayCardRank(Deck deck){
//        this.getCardFromDeck(deck);
//        RankType currentRankType = this.playerHand.get(0).getRank();
//        return currentRankType;
//    }
}
