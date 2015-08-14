// makes a deck 

public class BookChap1_4_1 {
    public static void main (String[] args) {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
        int i = (int) (Math.random() * rank.length);
        int j = (int) (Math.random() * suit.length);
        System.out.println(rank[i] + " of " + suit[j]);
    }
}