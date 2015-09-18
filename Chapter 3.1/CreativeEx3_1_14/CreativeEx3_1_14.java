// Print longest word. Read a list of words from standard input, and print out the longest word. Use the length method.

import java.util.Scanner;
public class CreativeEx3_1_14
{
    public static void main(String[] args)
    { // pretty straightforward here
        Scanner words = new Scanner(System.in);
        String longestWord = "";
        int wordLength = 0;
        
        // while there are words, read the next one and compare it to the previous longest word; if it is longer, make it longest word
        while (words.hasNext())
        {
            String newWord = words.next();
            if (newWord.length() > wordLength)
            {
                wordLength = newWord.length();
                longestWord = newWord;
            }
        }
        
        System.out.print(longestWord);
    }
}
        