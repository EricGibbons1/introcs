// Write a program Stats.java that takes an integer N from the command line,
// reads N double values from standard input, and prints their mean (average value)
// and sample standard deviation
// (square root of the sum of the squares of their differences from the average, divided by N - 1).

public class BookEx1_5_3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] list = new double[N];
            
        for (int i = 0; i < N; i++) {
            list[i] = StdIn.readDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += list[i];
        }
        double average = sum/N;
        
        double sumsq = 0.0;
        for (int i = 0; i < N; i++) {
            double dif = average - list[i];
            double difsq = dif * dif;
            sumsq += difsq;
        }
        double stddev = Math.sqrt(sumsq/(N-1));
        
        StdOut.println("Average = " + average + ", Std Dev = " + stddev);
    }
}
                
           
        
       