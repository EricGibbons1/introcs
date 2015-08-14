// Write a program FunctionGrowth.java that prints a table of the values of
// log N, N, N log N, N2, N3, and 2N for N = 16, 32, 64, ..., 2048.
// Use tabs ('\t' characters) to line up columns.

public class BookEx1_3_10 {
    public static void main (String[] args) {
        long N = 16;
        while (N <= 2048) {
            System.out.println(Math.log(N) + "\t" + N + "\t" + N*Math.log(N) + "\t" + N*N + "\t" + N*N*N + "\t" + Math.pow(2,N));
            N *= 2;
        }
    }
}