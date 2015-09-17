// Write a function that takes a string s and an integer n and returns a new string t of length exactly n that consists of s
// (truncated if its length is greater than n) followed by a sequence of '-' characters (if the length of s is less than n).

import java.util.Scanner;
public class BookEx3_1_12
{
    public static String newString(String s, int n)
    { // make a new string, use if/else in a for loop to add letters or dashes to it depending on s and n
        String t = new String();
        for (int i = 0; i < n; i++)
        {
            if (i < s.length()) t += s.charAt(i);
            else t += "-";
        }
        return t;
    }  
    
    public static void main(String[] args)
    { // tell user to put in a word and number, store them, run newString on them, print the new word
        System.out.println("Please enter a word and then a number");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = input.nextInt();
        System.out.println(newString(s, n));
    }
}