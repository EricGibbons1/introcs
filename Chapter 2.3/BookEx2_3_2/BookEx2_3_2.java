// Write a recursive program that computes the value of ln(N!).

public class BookEx2_3_2
{
    public static int factorial(int N)
    {
        if (N == 1) return 1;
        return N * (factorial(N - 1));
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.print(Math.log(factorial(N)));
    }
}