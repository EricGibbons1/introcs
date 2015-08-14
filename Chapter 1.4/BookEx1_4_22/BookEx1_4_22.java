// Empirical shuffle check. Run computational experiments to check that our shuffling code works as advertised.
// Write a program ShuffleTest that takes command-line arguments M and N, does N shuffles of an array of size M that is initialized
// with a[i] = i before each shuffle, and prints an M-by-M table such that row i gives the number of times i wound up in position j
// for all j. All entries in the array should be close to N/M.

public class BookEx1_4_22 {
    public static void main (String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[] end = new int[M];
        for (int i = 0; i < N; i++) {
            int[] shuffle = new int[M];
            for (int j = 0; j < M; j++) shuffle[j] = j;
            for (int k = 0; k < M; k++) {
                int r = k + (int) (Math.random() * (M - k));
                int temp =  shuffle[r];
                shuffle[r] = shuffle[k];
                shuffle[k] = temp;
            }
            for (int l = 0; l < M; l++)
                if (shuffle[l] == l) end[l] += 1;
        }
        for (int j = 0; j < M; j++) {
            for (int k = 0; k < M; k++) {
                System.out.print(end[k] + " ");
            }
            System.out.println();
        }
    }
}