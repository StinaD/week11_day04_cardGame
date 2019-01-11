import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private Card playerOneCard;
    private Card playerTwoCard;
    private ResultType result;

    public Deck(){
        this.deck = new ArrayList<>();
        this.playerOneCard = null;
        this.playerTwoCard = null;
        this.result = null;

    }

    public int getSize() {
        return deck.size();
    }


    public void populateDeck() {
        for(SuitType suit : SuitType.values()){
            for ( RankType rank : RankType.values() ){
                Card newCard = new Card(suit, rank);
                deck.add(newCard);
            }
        }
    }

    public void dealCardToPlayerOne(){
        Random rand = new Random();
        Card dealtCard = this.deck.get(rand.nextInt(this.deck.size()));
        this.playerOneCard = dealtCard;
    }

    public void dealCardToPlayerTwo(){
        Random rand = new Random();
        Card dealtCard = this.deck.get(rand.nextInt(this.deck.size()));
        this.playerTwoCard = dealtCard;
    }

    public int playerOneRank(){
        return this.playerOneCard.getRank().getValue();
    }

    public int playerTwoRank(){
        return this.playerTwoCard.getRank().getValue();
    }

    public boolean playerOneCardStatus(){
        return this.playerOneCard != null;
    }

    public boolean playerTwoCardStatus(){
        return this.playerTwoCard != null;
    }

    public String gameWinnerDetermined(){
        String gameResult = "";
        if(this.playerOneRank() == this.playerTwoRank()){
            gameResult = ResultType.DRAW.getValue();
        } else if (this.playerOneRank() > this.playerTwoRank()) {
            gameResult =  ResultType.PLAYER_ONE_WIN.getValue();
        } else {
            gameResult =  ResultType.PLAYER_TWO_WIN.getValue();
        }
        return gameResult;
    }

}
