// Write a program that reads in a string and prints out the first character that appears exactly once in the string. Ex: ABCDBAD -> C

public class BookEx3_1_17
{
    public static String onlyCharacter(String word)
    {
        for (int i = 0; i < word.length(); i++)
        { // see if the ith character appears in the substring of the word minus just that character
            String remainder = word.substring(0, i) + word.substring(i+1, word.length());
            if (!remainder.contains(word.valueOf(word.charAt(i)))) return word.valueOf(word.charAt(i));
        }
        return "";
    }
        
    public static void main(String[] args)
    { // get a word, print it's first unique character
        String word = args[0];
        System.out.println(onlyCharacter(word));
    }
}
    