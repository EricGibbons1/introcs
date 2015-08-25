// Write a method that takes double values ymin and ymax (with ymin strictly less than ymax) and a double array a[] as arguments and uses
// the StdStats library to linearly scale the values in a[] so that they are all between ymin and ymax.

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;

public class BookEx2_2_7
{
    // scale array between 0 and 1
    public static double[] scale01(double[] array)
    {
        double[] scale01 = new double[array.length];
        for (int i = 0; i < array.length; i++)
        {
            scale01[i] = (array[i] - StdStats.min(array)) / (StdStats.max(array) - StdStats.min(array));
        }
        return scale01;
    }
    
    // scale array from 0 - 1 to ymin - ymax
    public static double[] rescale(double[] scale01, double ymax, double ymin)
    {
        double[] rescale = new double[scale01.length];
        for (int i = 0; i < scale01.length; i++)
        {
            rescale[i] = (scale01[i] * (ymax - ymin)) + ymin;
        }
        return rescale;
    }
    
    public static void main(String[] args)
    {
        double ymin = Double.parseDouble(args[0]);
        double ymax = Double.parseDouble(args[1]);
        
        // read in doubles to list, then make array of them
        LinkedList<Double> myList = new LinkedList<Double>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            myList.add(input.nextDouble());
        }
        double[] array = new double[myList.size()];
        for (int i = 0; i < myList.size(); i++)
        {
            array[i] = myList.get(i);
        }
        
        // track return values from methods
        double[] scale01 = scale01(array);
        double[] rescale = rescale(scale01, ymax, ymin);
        System.out.print(Arrays.toString(rescale));
    }
}