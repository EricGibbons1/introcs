// Write a method that takes an array of double values as argument and rescales the array so that each element is between 0 and 1
// (by subtracting the minimum value from each element and then dividing each element
// by the difference between the minimum and maximum values).

import java.util.Arrays;
public class BookEx2_1_18
{
    public static double[] rescale(double min, double max, double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (a[i] - min) / (max-min);
        }
        
        return a;
    }
    
    public static double max(double[] a)
    {
        double max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max) max = a[i];
        }
        
        return max;
    }
    
    public static double min(double[] a)
    {
        double min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < min) min = a[i];
        }
        
        return min;
    }
    
    public static void main(String[] args)
    {
        double[] a = {1.5, 6.0, 4.5, 3.0};
        StdOut.printf(Arrays.toString(rescale(min(a), max(a), a)));
    }
}
            