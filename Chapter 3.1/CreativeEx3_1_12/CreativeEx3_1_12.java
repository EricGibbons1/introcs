// Frequency analysis of English text. Write a program LetterFrequency.java that reads in text from standard input (e.g., Moby Dick)
// and calculate the fraction of times each of the 26 lowercase letters appears.
// Ignore uppercase letters, punctuation, whitespace, etc. in your analysis.
// Use CharStdIn.java from Section 2.4 to read process the text file.

import java.util.Scanner;
public class CreativeEx3_1_12
{
    public static void main(String[] args)
    { // first get the text in a String
        Scanner input = new Scanner(System.in);
        String text = "";
        while (input.hasNext()) text += input.next();
        
        // then make the alphabet and an int array to count the letters
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] eachLetter = new int[26];
        int letterCount = 0;
        
        // check each char to see if it's a lowercase letter; if it is, than the int in the array of that letter goes up by one
        for (int i = 0; i < text.length(); i ++)
        {
            if (alphabet.contains(text.valueOf(text.charAt(i))))
            {
                eachLetter[alphabet.indexOf(text.valueOf(text.charAt(i)))] += 1;
                letterCount ++;
            }
        }
        
        // print text and frequency of each letter
        System.out.println(text);
        for (int i = 0; i < eachLetter.length; i++)
        {
            System.out.println(alphabet.charAt(i) + ": " + eachLetter[i] + " out of " + letterCount);
        }
    }
}
        
    