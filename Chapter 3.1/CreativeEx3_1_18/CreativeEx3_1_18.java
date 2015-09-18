// Capitalization. Write a program Capitalizer.java that reads in text strings from standard input and modifies each one so that
// the first letter in each word is uppercase and all other letters are lowercase.

import java.util.Scanner;
public class CreativeEx3_1_18
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext())
        {
            String word = reader.next();
            String capitalized = word.substring(0,1).toUpperCase() + word.substring(1, word.length()).toLowerCase();
            System.out.print(capitalized + " ");
        }
    }
}
            