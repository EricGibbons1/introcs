// Write a program Wget.java that takes the name of a URL as a command-line argument and saves the referenced file using the same filename.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WebEx3_1_3
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String url = new String(args[0]);
        File file = new File(url);
        Scanner reader = new Scanner(file);
        String contents = "";
        while (reader.hasNextLine()) contents += reader.nextLine();
        
        String filename = url.substring(url.lastIndexOf("/" + 1, url.length()));
        // all the things I could find only involved try/catch and I don't understand it, so I used the book's thing
        Out out = new Out(filename);
        out.println(contents);
        out.close();
    }
}
                                        
        
        
    