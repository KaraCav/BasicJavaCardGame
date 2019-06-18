public enum Value {   
  
    ACE(1), //objects inside of Suit, can do Suit.ACE.value
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    KING(12),
    QUEEN(13);
    
    private Integer value;
    
    //getter method
    public Integer getValue() {
     return this.value; 
    }
    
   // enum constructor- can't be public or protected 
    private Value(Integer value) {
     
      this.value = value;
      
    } 
}
