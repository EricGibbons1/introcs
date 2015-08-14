// Write a program WordCount.java that reads in text from standard input and prints out the number of words in the text.
// For the purpose of this exercise, a word is a sequence of non-whitespace characters that is surrounded by whitespace.

public class BookEx1_5_11 {
    public static void main(String[] args) {
        int count = 0;
        
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count ++;
            StdOut.println(word);
        }
        
        StdOut.print("There were " + count + " total words.");
    }
}