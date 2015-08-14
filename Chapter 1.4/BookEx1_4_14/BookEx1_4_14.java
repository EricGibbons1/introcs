// Write a program that takes an integer N from the command line and creates an N-by-N boolean array a[][]
// such that a[i][j] is true if i and j are relatively prime (have no common factors), and false otherwise.
// Use your solution to Exercise 1.4.6 to print the array. Hint: Use sieving.

public class BookEx1_4_14 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[N][N];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (i == 1 || j == 1) a[i][j] = true;
                else if (i == j) a[i][j] = false;
                else if (Math.max(i,j) - Math.min(i,j) == 1) a[i][j] = true;
                else if (Math.max(i,j) % Math.min(i,j) == 0 || Math.min(i,j) % (Math.abs(i-j)) == 0) a[i][j] = false;
                else a[i][j] = true;
            }
        }
        
        System.out.print("     ");
        for (int i = 0; i < N; i++) System.out.print(i + "     ");
        System.out.println();
        
        for (int i = 0; i < N; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}