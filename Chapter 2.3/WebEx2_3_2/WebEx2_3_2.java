// Write a recursive program GoldenRatio.java that takes an integer input N and computes an approximation to the golden ratio
// using the following recursive formula:
// f(N) = 1               if N = 0
     // = 1 + 1 / f(N-1)  if N > 0

public class WebEx2_3_2
{
    public static double golden(int N)
    {
        if (N == 0) return 1;
        return 1 + (1 / golden(N-1));
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.println(golden(N));
    }
}