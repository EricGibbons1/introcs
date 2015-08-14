public class WebEx1_2_30 {
    public static void main (String[] args) {
        // Uniform random numbers. Write a program Stats5.java that prints five uniform
        // random values between 0 and 1, their average value, and their minimum and
        // maximum value. Use Math.random(), Math.min(), and Math.max().
        
        int N = 5;
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();
        
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        
        double min = Math.min(x1, (Math.min(x2, Math.min(x3, Math.min(x4, x5)))));
        double max = Math.max(x1, (Math.max(x2, Math.max(x3, Math.max(x4, x5)))));
        double average = (x1 + x2 + x3 + x4 + x5) / N;
        
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + average);
    }
}