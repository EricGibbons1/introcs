// Write a program Deal.java that takes an command-line argument N and prints N poker hands (five cards each) from a shuffled deck,
// separated by blank lines.

public class BookEx1_4_10 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] deck = new String[rank.length * suit.length];
        // Making the deck
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[i*suit.length + j] = rank[i] + " of " + suit[j];
            }
        }
        //Shuffling the deck
        for (int i = 0; i < deck.length; i++) {
            int random = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        // Number of hands
        for (int j = 0; j < N; j++) {
            // Printing out the hands
            for (int k = 0; k < 5; k++) {
                // Add (j*5) to make sure you deal out hands of 5 and skip them for the next hand.
                if (k != 4) System.out.print(deck[(j*5) + k] + ", ");
                else System.out.print(deck[(j*5) + k]);
            }
            System.out.println();
        }
    }
}
                    
                
            