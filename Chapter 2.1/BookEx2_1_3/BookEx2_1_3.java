// Write a static method majority() that takes three boolean arguments and returns true if at least two of the arguments have the value
// true, and false otherwise. Do not use an if statement.

public class BookEx2_1_3 
{
    public static boolean majority(boolean a, boolean b, boolean c)
    {
        return ((a && b) || (b && c) || (a && c));
    }
    
    public static void main(String[] args)
    {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);
        System.out.print(majority(a,b,c));
    }
}
        