// Given a string, create a new string with all the consecutive duplicates removed. Ex: ABBCCCCCBBAB -> ABCBAB.

public class BookEx3_1_18
{
    public static String dedupe(String word)
    { // if the ith character isn't equal to the i+1st character, add it to the new word; then add the last character
        String deduped = "";
        for (int i = 0; i < word.length() - 1; i++)
        {
            if (word.charAt(i) != word.charAt(i+1)) deduped += word.valueOf(word.charAt(i));
        }
        deduped += word.valueOf(word.charAt(word.length()-1));
        return deduped;
    }
    
    public static void main(String[] args)
    { // take in a word, print out the consecutively deduped version
        String word = args[0];
        System.out.println(dedupe(word));
    }
}