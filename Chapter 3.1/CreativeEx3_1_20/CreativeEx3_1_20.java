// Railfence transposition cipher. Write a program RailFenceEncoder.java that reads in text from standard input and prints out
// the characters in the odd positions, followed by the even positions.
// For example, if the original message is "Attack at Dawn", then you should print out "Atc tDwtaka an".
import java.util.Scanner;
public class CreativeEx3_1_20
{
    public static String code(String text)
    { // not sure if this is better done with recursion? made a method just because this took like 2 minutes
        String odds = "";
        String evens = "";
        for (int i = 0; i < text.length(); i++)
        {
            if (i % 2 == 0) odds += text.charAt(i);
            else evens += text.charAt(i);
        }
        return odds + evens;
    }
        
    public static void main(String[] args)
    { // is there a way of doing this using next() rather than nextLine()? I lost the spaces w/ next() so did it this way
        Scanner input = new Scanner(System.in);
        String text = "";
        while (input.hasNext()) text += input.nextLine();
        
        String code = "";
        for (int i = 0; i < text.length(); i+=2) code += text.charAt(i);
        for (int i = 1; i < text.length(); i+=2) code += text.charAt(i);
        System.out.println(code);
        System.out.println(code(text));
    }
}