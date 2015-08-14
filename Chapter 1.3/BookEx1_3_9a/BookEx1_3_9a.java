// Write a program that takes an integer N as a command-line argument and uses Math.random()
// to print N uniform random variables between 0 and 1, and then prints their average value.

public class BookEx1_3_9a {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double random = Math.random();
            sum += random;
        }
        System.out.println(sum/N);
    }
}