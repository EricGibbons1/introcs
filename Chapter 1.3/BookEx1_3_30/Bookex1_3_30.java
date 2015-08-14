// Write a program PowersOfK that takes an integer k as command-line argument and prints all the positive powers of k in the Java
// long data type. Note: The constant Long.MAX_VALUE is the value of the largest integer in long.

public class Bookex1_3_30 {
    public static void main (String[] args) {
        long k = Long.parseLong(args[0]);
        for (int i = 1; Math.pow(k,i) <= Long.MAX_VALUE; i++) {
            System.out.println(Math.pow(k,i));
        }
    }
}