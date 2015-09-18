// Print longest word(s). Repeat the previous exercise, but print out all of the longest words if there is a tie
// say up to a maximum of 10 words. Use an array of strings to store the current longest words.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;
public class CreativeEx3_1_15
{   
    public static void main(String[] args)
    { // instead of using an array of arbitrary size I used a LinkedList. I could have used .size() to make an array but it doesn't matter
        Scanner words = new Scanner(System.in);
        String longestWord = "";
        int wordLength = 0;
        LinkedList<String> longwords = new LinkedList<String>();
        
        // same as previous exercise except now I store equally long words in a LinkedList that clears when a new longest word is found
        while (words.hasNext())
        {
            String newWord = words.next();
            if (newWord.length() == wordLength) longwords.add(newWord);
            if (newWord.length() > wordLength)
            {
                longwords.clear();
                longwords.add(newWord);
                wordLength = newWord.length();
                longestWord = newWord;
            }
        }
        System.out.print(Arrays.toString(longwords.toArray()));
    }
}