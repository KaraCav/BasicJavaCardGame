import java.util.*;

public class CardGameStart {
  
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Integer playerCount = 1;
    Integer cardCount;
    Integer numberOfGames = 0;
    
    System.out.println("Welcome to The Card Game");
    
    System.out.print("How many players : ");
    playerCount = scanner.nextInt();
    if (playerCount < 2 || playerCount > 10) {
      System.exit(0);
    }
    
    System.out.print("How many cards per hand : ");
    cardCount = scanner.nextInt();
    if (cardCount < 2 || cardCount > 10) {
      System.exit(0);
    }
    
    // extra how to handle Deck and Players
    Deck myDeck = new Deck();
    myDeck.init();
    
    List<Player> cardHolders = new ArrayList<Player>();
    for(int playerIndex = 0; playerIndex <= playerCount; playerIndex++) {
       cardHolders.add(new Player("name to accept", myDeck.drawCards(cardCount), cardCount));
    }
    for(Player cardHolder: cardHolders) {
      System.out.println("Player " + cardHolder.getName() );
     cardHolder.printCards();
     cardHolder.printHandValue();
    }
  }

}
