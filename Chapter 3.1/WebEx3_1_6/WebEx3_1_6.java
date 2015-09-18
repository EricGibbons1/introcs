// Scrambled text. Some cognitive psychologists believe that people recognize words based on their shape.
// Write a program that reads in text from standard input and prints the text back out, but shuffles the internal letters in each word.
// Write and use a function scramble() that takes as input a string and returns another string with the internal letters in random order.
// Use the shuffling algorithm in Shuffle.java for the shuffling part.

import java.util.Scanner;
public class WebEx3_1_6
{
    public static String shuffle(String x)
    {
        String newLetters = "";
        String[] insideLetters = new String[x.length()];
        for (int i = 0; i < insideLetters.length; i++)
        {
            insideLetters[i] = x.valueOf(x.charAt(i));
        }
        for (int i = 0; i < insideLetters.length; i++)
        {
            int y = i + (int) (Math.random() * (insideLetters.length - i));
            String temp = insideLetters[i];
            insideLetters[i] = insideLetters[y];
            insideLetters[y] = temp;
        }
        for (int i = 0; i < insideLetters.length; i++)
        {
            newLetters += insideLetters[i];
        }
        return newLetters;
    }

    public static String scramble(String[] allWords)
    {
        String newPhrase = "";
        for (int i = 0; i < allWords.length; i++)
        {// for each word
            String scrambleLetters = allWords[i].substring(1,allWords[i].length()-1);
            newPhrase += allWords[i].valueOf(allWords[i].charAt(0)) + shuffle(scrambleLetters) + allWords[i].valueOf(allWords[i].charAt(allWords[i].length()-1)) + " ";
        }
        return newPhrase;
    }
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String words = "";
        while (input.hasNextLine()) words += input.nextLine();
        String[] allWords = words.split("\\s");
        System.out.println(scramble(allWords));
        
    }
}