//  read 1-d array of: double, int, boolean;
//  read 2-d array of: double, int, boolean;
//  print 1-d array of: double, int, boolean;
//  print 2-d array of: double, int, boolean;


import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class BookEx2_2_6
{
    // read input for integers and make new 1D array
    public static int[] readInt1D()
    {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            myList.add(input.nextInt());
        }
        int N = myList.size();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
        {
            array[i] = myList.get(i);
        }
        return array;
    }

    // read input for doubles and make new 1D array    
    public static double[] readDouble1D()
    {
        LinkedList<Double> myList = new LinkedList<Double>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            myList.add(input.nextDouble());
        }
        int N = myList.size();
        double[] array = new double[N];
        for (int i = 0; i < N; i++)
        {
            array[i] = myList.get(i);
        }
        return array;
    }

    // read input for booleans and make new 1D array    
    public static boolean[] readBoolean1D()
    {
        LinkedList<Boolean> myList = new LinkedList<Boolean>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            myList.add(input.nextBoolean());
        }
        int N = myList.size();
        boolean[] array = new boolean[N];
        for (int i = 0; i < N; i++)
        {
            array[i] = myList.get(i);
        }
        return array;
    }    
    
    // print 1D array of booleans
    public static void printBoolean1D(boolean[] array)
    {
        System.out.print(Arrays.toString(array));
    }
    
    // print 1D array of integers
    public static void printInt1D(int[] array)
    {
        System.out.print(Arrays.toString(array));
    }
    
    // print 1D array of doubles
    public static void printDouble1D(double[] array)
    {
        System.out.print(Arrays.toString(array));
    }    
    
    public static void main(String[] args)
    {
        printInt1D(readInt1D());
    }
}