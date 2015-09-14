// Write a program Fibonacci2.java that takes a command-line argument N and prints out the first N Fibonacci numbers
// using the following alternate definition:
// F(n)   = 1                             if n = 1 or n = 2
//        = F((n+1)/2)2 + F((n-1)/2)2     if n is odd
//        = F(n/2 + 1)2 - F(n/2 - 1)2     if n is even

public class BookEx2_3_10
{
    public static long Fibonacci2(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (N == 2) return 1;
        
        if (N > 2 && N % 2 == 1)
        {
            long a = Fibonacci2((N+1)/2);
            long b = Fibonacci2((N-1)/2);
            return a*a + b*b;
        }
        
        long a = Fibonacci2(N/2 + 1);
        long b = Fibonacci2(N/2 - 1);
        return a*a - b*b;
        
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        long sum = 0;
        for (int i = 0; i <= N; i++)
        {
            sum += Fibonacci2(i);
            System.out.println(i + ":" + Fibonacci2(i));
        }
        System.out.println("Total sum = " + sum);
    }
}