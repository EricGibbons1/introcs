// Write a test client for both StdStats and StdRandom that checks that all of the methods in both libraries operate as expected.
// Take a command-line parameter N, generate N random numbers using each of the methods in StdRandom, and print out their statistics.
// Extra credit : Defend the results that you get by comparing them to those that are to be expected from mathematical analysis.


// Ryan, it made sense to me how to do this for uniform and gaussian but not bernoulli, discrete and shuffle -- am I missing something?

public class BookEx2_2_3
{
    public static double[] uniform(int N)
    {
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = StdRandom.uniform(N);
        }
        return a;
    }
    
    public static double[] gaussian(int N)
    {
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = StdRandom.gaussian();
        }
        return a;
    }
    
    public static void stats(double[] a)
    {
        System.out.println("Min = " + StdStats.min(a));
        System.out.println("Max = " + StdStats.max(a));
        System.out.println("Mean = " + StdStats.mean(a));
        System.out.println("Var = " + StdStats.var(a));
        System.out.println("Std Dev = " + StdStats.stddev(a));
    }

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.println("Test of StdRandom.uniform:");
        stats(uniform(N));
        System.out.println();
        System.out.println("Test of StdRandom.gaussian:");
        stats(gaussian(N));
    }
}
            
            
        