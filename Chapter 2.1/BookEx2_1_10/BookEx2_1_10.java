// Write a static method lg() that takes a double value N as argument and returns the base 2 logarithm of N.
// You may use Java's Math library.

public class BookEx2_1_10
{
    public static double lg(double N)
    {
        return Math.log(N)/Math.log(2);
    }
    
    public static void main(String[] args)
    {
        double N = Double.parseDouble(args[0]);
        System.out.print("The base 2 log of " + N + " is: " + lg(N));
    }
}
    