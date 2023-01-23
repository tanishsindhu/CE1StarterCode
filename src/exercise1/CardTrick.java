package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Tanish Sindhu Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1 + Math.random()*13));
            card.setSuit(card.SUITS[(int)(0+Math.random()*3)]);
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
            System.out.println(hand[i].getSuit()+" "+ hand[i].getValue());
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    Scanner card = new Scanner(System.in);
    System.out.println("Guess the card value");
    int guessValue = card.nextInt();
    System.out.println("Guess the card suit");
    String guessSuit = card.next();
    
    for(int i =0; i<7; i++){
        if(guessValue == hand[i].getValue()){
            if(guessSuit.equals(hand[i].getSuit())){
                printInfo();
            }
        }
    }
    }

    
    
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Tanish Sindhu Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Tanish, but you can call me Tanish, bro or bhai");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on my Sheridan college club and try to make it best.");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Listening music");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my mustang");

        System.out.println();
        
    
    }

}

