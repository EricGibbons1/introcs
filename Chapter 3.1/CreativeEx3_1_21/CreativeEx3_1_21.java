// Railfence transposition cipher. Write a program RailFenceDecoder.java that reads in a message
// encoded using the railfence transposition cipher and prints out the original message by reversing the encryption process.

import java.util.Scanner;
import java.util.Arrays;
public class CreativeEx3_1_21
{
    public static String decode(String text)
    { // two operations, depending on if the string has an odd or even number of charaters; makes two substrings and adds ith char or each
        String secret = "";
        if (text.length() % 2 == 0)
        {
            String part1 = text.substring(0, text.length()/2);
            String part2 = text.substring(text.length()/2,text.length());
            for (int i = 0; i < text.length()/2; i++)
            {
                secret += part1.charAt(i);
                secret += part2.charAt(i);
            }
            return secret;
        }
        String part1 = text.substring(0, text.length()/2+1);
        String part2 = text.substring(text.length()/2+1,text.length());
        for (int i = 0; i < text.length()/2; i++)
        {
            secret += part1.charAt(i);
            secret += part2.charAt(i);
        }
        return secret + part1.charAt(part1.length()-1);
    }
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = "";
        while (input.hasNext()) text += input.nextLine();
        System.out.println(decode(text));
    }
}
        