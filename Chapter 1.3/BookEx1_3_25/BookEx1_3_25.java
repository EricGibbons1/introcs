// Modify Factors.java to print just one copy of each of the prime divisors.

public class BookEx1_3_25 {

    public static void main(String[] args) { 

        // command-line argument
        long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor i
        for (long i = 2; i*i <= n; i++) {

            // if i is a factor of N, repeatedly divide it out
            if (n % i == 0) {
                int x = 0;
                System.out.print(i + ": ");
                while (n % i == 0) {
                    n /= i;
                    x++;
                }
                System.out.print (x + " times, ");
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}
