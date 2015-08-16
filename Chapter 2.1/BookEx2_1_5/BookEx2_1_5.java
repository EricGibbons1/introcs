// Write a static method areTriangular() that takes three double values as arguments and returns true if they could be
// the sides of a triangle (none of them is greater than or equal to the sum of the other two). 

public class BookEx2_1_5
{
    public static boolean triangle(double a, double b, double c)
    {
        if (a >= b + c) return false;
        if (b >= a + c) return false;
        if (c >= a + b) return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        StdOut.print(triangle(a, b, c));
    }
}