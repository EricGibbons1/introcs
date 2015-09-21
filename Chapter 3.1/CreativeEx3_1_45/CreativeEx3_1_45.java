// Longest word. Given a dictionary of words and a starting word s, find the longest word that can be formed, starting at s,
// and inserting one letter at a time such that each intermediate word is also in the dictionary.
// For example, if the starting word is cal, then the following is a sequence of valid words coal, coral, choral, chorale.

// FYI Ryan I know this should have me first insert a dictionary's words into a giant String array using split.() ...
// but instead I am just inserting the example words into an array to save time and proof the solution -- I hope that's okay
// Also I have a question about trees. Imagine the following dictionary: car, care, carp, carpe. Should I be storing all possible
// "longest words" at each given step, and then be running the solution on all of them to look for the next "longest words", so on and so on?
// Do you see what I mean?

import java.util.LinkedList;
public class CreativeEx3_1_45
{
    public static void main(String[] args)
    {
        String[] dictionary = {"coal", "coral", "choral", "chorale"};
        String s = "cal";
        int length = s.length();
        LinkedList<String> longestWords = new LinkedList<String>();
        longestWords.add(s);
        
        int longestDictWord = 0;
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int N = "pneumonoultramicroscopicsilicovolcanoconiosis".length();
        
        // find longest word in dictionary
        for (int i = 0; i < dictionary.length; i++)
        {
            if (dictionary[i].length() > longestDictWord) longestDictWord = dictionary[i].length();
        }
        
        // for each possible letter addition up to the longest possible word (doing 5 here to save time)
        for (int i = 0; i < 5; i++)
        { // for each possible letter to be added
            for (int j = 0; j < 26; j++)
            {// for each word in the LinkedList
                for (int m = 0; m < longestWords.size(); m++)
                { // for each potential space in s to add a letter to
                    for (int k = 0; k < longestWords.get(m).length(); k++)
                    { // for each word in the dictionary                                                                                   
                        for (int l = 0; l < dictionary.length; l++)
                        {
                            String word = longestWords.get(m);
                            if (word.length() == longestDictWord) break;
                            if (dictionary[l].equals(alphabet.valueOf(alphabet.charAt(j)) + word))
                            {
                                longestWords.add(dictionary[l]);
                                break;
                            }
                            if (dictionary[l].equals(word + alphabet.valueOf(alphabet.charAt(j))))
                            {
                                longestWords.add(dictionary[l]);
                                break;
                            }
                            String possible = word.substring(0, k) + alphabet.valueOf(alphabet.charAt(j)) + word.substring(k,word.length());
                            if (dictionary[l].equals(possible))
                            {
                                longestWords.add(dictionary[l]);
                                break;
                            }
                        }
                    }
                }
            }
            length++;
        }
        int adds = 0;
        for (int n = 0; n < longestWords.size(); n++)
        {
            if (longestWords.get(n).length() == longestDictWord) System.out.println(longestWords.get(n));
            adds++;
        }
        System.out.println(adds);
    }
}
                        
                
            