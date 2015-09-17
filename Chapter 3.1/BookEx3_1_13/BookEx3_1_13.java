// Write a function that takes as input a string and returns true if the string is a palindrome, and false otherwise.
// A palindrome is a string that reads the same forwards or backwards.

public class BookEx3_1_13
{
    public static boolean isPalindrome(String word)
    { // check if the ith letter is the same as the N - i - 1st letter
        for (int i = 0; i < word.length()/2; i++)
        {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) return false;
        }
        return true;
    }
        
        
    public static void main(String[] args)
    { // get the word, test if it is a palindrome
        String word = args[0];
        System.out.println(isPalindrome(word));
    }
}
        