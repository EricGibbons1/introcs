// Given a string s that represents the name of a file, write a code fragment to determine its base name (filename minus any directories)
// For /Users/wayne/monalisa.jpg, it is monalisa.jpg.

public class BookEx3_1_24
{
    public static void main(String[] args)
    {
        String filename = args[0];
        CharSequence backslash = "/";
        String basename = new String();
        if (filename.contains(backslash)) basename = filename.substring(filename.lastIndexOf("/")+1, filename.length());
        else basename = filename;
        System.out.println(basename);
    }
}