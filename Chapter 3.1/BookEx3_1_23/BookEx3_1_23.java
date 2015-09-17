// Given a string s that represents the name of a file, write a code fragment to determine its directory portion.
// This is the prefix that ends with the last / character (the directory delimiter); if there is no such /, then it is the empty string.
// For example, the directory portion of /Users/wayne/monalisa.jpg is /Users/wayne/.

public class BookEx3_1_23
{
    public static void main(String[] args)
    { // Am I missing something or does this not even require a method?
        String filename = args[0];
        CharSequence backslash = "/";
        String directory = new String();
        if (filename.contains(backslash)) directory = filename.substring(0,filename.lastIndexOf("/"));
        else directory = filename;
        System.out.println(directory);
    }
}