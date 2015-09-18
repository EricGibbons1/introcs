// Given a string s that represents the name of a web page, break it up into pieces, where each piece is separated by a period, e.g.,
// http://www.cs.princeton.edu should be broken up into www, cs, princeton, and edu, with the http:// part removed.
// Use either the split or indexOf methods.

import java.util.Arrays;
public class BookEx3_1_21
{
    public static void main(String[] args)
    { // remove http stuff if there, break into sections, store in array, print array
        String site = args[0];
        CharSequence http = "http://";
        if (site.contains(http)) site = site.substring(site.indexOf("w"),site.length());
        String[] sections = site.split("\\.");
        System.out.println(Arrays.toString(sections));
    }
}
        
        