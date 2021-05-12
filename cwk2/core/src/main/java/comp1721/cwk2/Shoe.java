package comp1721.cwk2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Implement the Shoe class here
public class Shoe extends CardCollection {
    private int numOfDecks;
    protected List<BaccaratCard> cards;

    Shoe(int decks) {
        if (decks != 6 && decks != 8) {
            throw new CardException("Wrong number of decks.");
        } else {
            numOfDecks = decks;
            cards = new LinkedList<>();
            for (int i = 0; i < decks; i++) {
                for (Card.Suit suit : Card.Suit.values()) {
                    for (Card.Rank rank : Card.Rank.values()) {
                        Card card = new Card(rank, suit);
                        this.add(card);
                    }
                }
            }
        }
    }

    public int size() {
        return this.size();
    }
    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    public BaccaratCard del(){
        BaccaratCard firstCard  = this.cards.get(0);
        this.cards.remove(0);
        return firstCard;
    }


//    public static void main(String[] args) throws CardException {
//
////        BaccaratCard a = new BaccaratCard("AC");
////        BaccaratCard b = new BaccaratCard("4D");
//        Shoe cards = new Shoe(8);
//        cards.shuffle();
////        cards.add(a);
////        cards.add(b);
//        System.out.println(cards.toString());
//    }

}