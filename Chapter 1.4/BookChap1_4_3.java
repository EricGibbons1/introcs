// makes a deck, shuffles it, and prints it out Bummer-style

public class BookChap1_4_3 {
    public static void main (String[] args) {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
        String[] deck = new String[suit.length * rank.length];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length*i + j] = rank[i] + " of " + suit[j];
            }
        }
        
        int N = deck.length;
        for (int i = 0; i < N; i++) {
            int r = i + (int) (Math.random() * (N-i));
            String t = deck[i];
            deck[i] = deck[r];
            deck[r] = t;
        }
        
        for (int k = 0; k < deck.length; k = k + 3) {
            if (k < 51) System.out.println(deck[k] + ", " + deck[k+1] + ",   middle: " + deck[k+2]);
        }
        
        
        
    }
}
            
