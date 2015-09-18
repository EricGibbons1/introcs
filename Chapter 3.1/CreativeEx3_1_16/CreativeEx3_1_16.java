// Test if two files are equal. Write a program that takes the name of two text files as command line inputs and checks if their contents
// are identical.

// I did this with Strings only because I don't understand how bytes would have worked -- assuming bytes would be better?
// Also it seems like there is something called FileReads that is built to do this anyway?

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
public class CreativeEx3_1_16
{
    public static String[] input(String filename) throws FileNotFoundException
    {
        File text = new File(filename);
        Scanner input = new Scanner(text);
        LinkedList<String> listWords = new LinkedList<String>();
        while (input.hasNext())
        {
            listWords.add(input.next());
        }
        String[] stringWords = new String[listWords.size()];
        for (int i = 0; i < listWords.size(); i++)
        {
            stringWords[i] = listWords.get(i);
        }
        return stringWords;
    }
    
    
    public static boolean equals(String[] file1, String[] file2)
    {
        if (file1.length != file2.length) return false;
        for (int i = 0; i < file1.length; i++)
        {
            if (!file1.equals(file2)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        String file1 = args[0];
        String file2 = args[1];
        String[] file1words = input(file1);
        String[] file2words = input(file2);
        if (equals(file1words, file2words)) System.out.println("The two files are equal");
        else System.out.print("The two files are not equal");
    }
}
        

                                