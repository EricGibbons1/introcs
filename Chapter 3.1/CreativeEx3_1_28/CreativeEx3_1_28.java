// Haiku detector. Write a program that reads in text from standard input and checks whether it forms a haiku.
// A haiku consists of three lines containing the correct number of syllables (5, 7, and 5, respectively).
// For the purpose of this problem, define a syllable to be any contiguous sequence of consecutive vowels (a, e, i, o, u, or y).
// According to this rule, haiku has two syllables and purpose has three syllables.

import java.util.Scanner;
import java.util.Arrays;
public class CreativeEx3_1_28
{
    public static boolean haikuCheck(String[] haiku, String vowels)
    { // check to see if a vowel is ever followed by a non vowel -- in those cases increase count; check each line's count for proper #
        for (int i = 0; i < 3; i++)
        {
            if (i != 1)
            {
                int count = 0;
                for (int j = 0; j < haiku[i].length() - 1; j++)
                {
                    if (vowels.contains(haiku[i].valueOf(haiku[i].charAt(j))) && !vowels.contains(haiku[i].valueOf(haiku[i].charAt(j+1)))) count++;
                }
                if (vowels.contains(haiku[i].valueOf(haiku[i].charAt(haiku[i].length()-1)))) count++;
                if (count != 5) return false;
            }
             if (i == 1) 
            {
                int count = 0;
                for (int j = 0; j < haiku[i].length() - 1; j++)
                {
                    if (vowels.contains(haiku[i].valueOf(haiku[i].charAt(j))) && !vowels.contains(haiku[i].valueOf(haiku[i].charAt(j+1)))) count++;
                }
                if (vowels.contains(haiku[i].valueOf(haiku[i].charAt(haiku[i].length()-1)))) count++;
                if (count != 7) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    { // use hasNextLine, and random character, and split() to make a String array. check each string for haiku parameters
        Scanner input = new Scanner(System.in);
        String text = "";
        while (input.hasNextLine())
        {
            text += input.nextLine();
            text += "XXX";
        }
        String[] haiku = text.split("X{3}");
        String vowels = "aeiouy";
        
        System.out.println(Arrays.toString(haiku));
        System.out.print(haikuCheck(haiku, vowels));
    }
}
        