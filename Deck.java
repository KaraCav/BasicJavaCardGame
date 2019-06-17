import java.util.*;
public class Deck {

  private List<Card> cards = new ArrayList<>();
  // can also write as private List<Card> cards;
  // both lists and sets are collections
  // sets are an instantiation, only one can be in this list
  public Deck(){}
  public Deck(List<Card> cards) {
    cards.addAll(cards);
  }
  
  public Integer deckCount() {
    return cards.size();
  }
  
  public void shuffle() {
    Collections.shuffle(this.cards);
  }
  
  public List<Card> drawCards(Integer number) {
    List<Card> selectedCards = this.cards.subList(0, number);
    this.cards = this.cards.subList(number, this.cards.size()); 
// removes all sublist cards but doesn't return original, just boolean of successful
    return selectedCards;
//List drawnCard = cards.pop();
  }
  
  public void init(){
   this.cards = new ArrayList<>();
   List<Suit> suits = Arrays.asList(Suit.SPADE, Suit.DIAMOND, Suit.CLUB, Suit.HEART);
   List<Value> values = Arrays.asList(Value.ACE, Value.TWO, Value.THREE, Value.FOUR, 
                                      Value.FIVE, Value.SIX, Value.SEVEN, Value.EIGHT, 
                                      Value.NINE, Value.TEN, Value.JACK, Value.KING, Value.QUEEN);
 
    for (Suit suit : suits) {
      for (Value value : values) {
       this.cards.add(new Card(suit, value));
      }
    }
    this.shuffle();
  }
}
