public class BookEx1_3_9 {
    public static void main (String[] args) {
        // Print the prime factors of N
        long N = Long.parseLong(args[0]);
        long n = N;
        for (long i = 2; i<= n/i; i++) {
            // test where i is a factor
            while (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
            } // Any factors of n are greater than i.
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
            