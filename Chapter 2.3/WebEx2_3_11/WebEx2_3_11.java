// Write a program that takes a command-line argument N and prints out the first N Fibonacci numbers using the following method
// proposed by Dijkstra:
// F(0) =  0
// F(1) =  1
// F(2n-1) = F(n-1)^2 + F(n)^2
// F(2n) = (2F(n-1) + F(n)) * F(n)

public class WebEx2_3_11
{
    public static int bigDijk(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (N % 2 == 0) return (2 * bigDijk(N/2-1) + bigDijk(N/2)) * bigDijk(N/2);
        return bigDijk(((N-1)/2)-1) * bigDijk(((N-1)/2)-1) + bigDijk((N-1)/2) * bigDijk((N-1)/2);
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.println(bigDijk(N));
    }
}