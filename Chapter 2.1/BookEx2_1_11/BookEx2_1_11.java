// Write a static method lg() that takes an int value N as argument and returns
// the largest int not larger than the base-2 logarithm of N.

public class BookEx2_1_11
{
    public static int lg(int N)
    {
        return (int) (Math.log(N)/Math.log(2));
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.print(lg(N));
    }
}
