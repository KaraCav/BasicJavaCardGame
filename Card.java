public class Card { 
  //no setters, only getters
  private Suit suit;
  private Value value;
  
  public Card(Suit suit, Value value) {
    this.suit = suit;
    this.value = value; 
  }
  
  public Suit getSuit() {
   return suit; 
  }
  
  public Value getValue() {
   return value; 
  }
  // objects have a .equals() method on them
  // can make sure the card doesn't already exist
  
  public String getDisplayString() {
   return value.toString() + " of " + suit.toString(); 
  }
  
}
