// Write a static method max3() that takes three int values as arguments and returns the value of the largest one.
// Add an overloaded function that does the same thing with three double values.

public class BookEx2_1_1
{
    public static int max3(int a, int b, int c)
    {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    
    public static double max3(double a, double b, double c)
    {
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}