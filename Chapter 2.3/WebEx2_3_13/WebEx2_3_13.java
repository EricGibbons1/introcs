// Write a program Pell.java that takes a command-line argument N and prints out the first N Pell numbers:
// p0 = 0, p1 = 1, and for n >= 2, pn = 2 pn-1 + pn-2.
// Print out the ratio of successive terms and compare to 1 + sqrt(2).
// obviously approximates 1 + root 2. So does my function. Booyah!

public class WebEx2_3_13
{
    public static double pell(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return ((2 * pell(N-1)) + pell(N-2));
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i<= N; i++)
        {
            System.out.println(pell(i));
            if (i > 1)
            {
               System.out.println((("pell" + "" + i) + "/" + ("pell" + "" + (i-1))) + " = " + (pell(i)/pell(i-1)));
               System.out.println("Sqrt 2 = " + (1 + Math.sqrt(2)));
               System.out.println();
            }
        }
    }
}