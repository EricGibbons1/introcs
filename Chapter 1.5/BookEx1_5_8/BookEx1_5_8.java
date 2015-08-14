// Write a program GeometricMean.java that reads in positive real numbers from standard input and prints out their geometric mean.
// The geometric mean of N positive numbers x1, x2, ..., xN is (x1 * x2 * ... * xN) ^ 1/N.
// Write a program HarmonicMean.java that reads in positive real numbers from standard input and prints out their harmonic mean.
// The harmonic mean of N positive numbers x1, x2, ..., xN is (1/x1 + 1/x2 + ... + 1/xN) / (1 / N).

public class BookEx1_5_8 {
    public static void main(String[] args) {
        
        // harmonic calculation
        double sum = 0;
        double count = 0;
        
        while (!StdIn.isEmpty()) {
            double num = StdIn.readDouble();
            sum += 1/num;
            count++;
        }
        
        double harm = count/sum;
        StdOut.println(harm);
        StdOut.println(sum);
        StdOut.println(count);
    }
}
            
            