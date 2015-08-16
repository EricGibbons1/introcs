// Write a static method signum() that takes an int value N as argument and returns -1 if N is less than 0, 0 if N is equal to 0,
// and +1 if N is greater than 0.

public class BookEx2_1_13
{
    public static String signum(int N)
    {
        if (N > 0) return "+1";
        if (N < 0) return "-1";
        return "0";
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.print(signum(N));
    }
}