import java.util.*;
public class Player {
private String name; 
  public Player(String name, List<Card> cards, Integer maxCardCount){  
//this is constructor syntax- public and then name 
    this.name = name;
    this.cards = cards; //limit to maxCardCount
    this.maxCardCount = maxCardCount;
  }
  public String getName() {
    return this.name;   
}
  //need to instantiate private list of cards
  //lists are typeless, so you tell it what it will contain
  private List<Card> cards = new ArrayList<Card>();
  private Integer maxCardCount = 5;
  
  public List<Card> getCards() {
   return cards; 
  }
  
  public Integer getHandValue() {
   Integer cardValue = 0;
    for(Card card : cards) {
     cardValue += card.getValue().getValue(); 
    }
    return cardValue;
  }
  
  public void setCards(List<Card> cards) {
    if (cards.size() != maxCardCount) {
      System.out.println("Played " + this.name + " tried to cheat with " + cards.size() + " in their hand!");
      System.exit(0);
    } else {
      this.cards.addAll(cards);
    }
  }
  
  public void printHandValue() {
   System.out.println(getHandValue()); 
  }
  public void printCards() {
    for (Card card : cards) {
     System.out.println(card.getDisplayString()); 
    }
  }
}
