// Extend your program from the previous exercise to create a filter that prints
// all the values that are further than 1.5 standard deviations from the mean.

public class BookEx1_5_4 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] list = new double[N];
        double[] big = new double[N];
            
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
        
        StdOut.println("The numbers that are more than 1.5 std dev from mean are: ");
        for (int i = 0; i < N; i++) {
            if (Math.abs(list[i]-average) > (1.5 * stddev)) StdOut.print(list[i] + ", ");
        }
        StdOut.print(".");
        
    }
}