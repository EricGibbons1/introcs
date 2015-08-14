// Write code fragments to create a two-dimensional array b[][] that is a copy of an existing two-dimensional array a[][],
// under each of the following assumptions:
// 1. a[][] is square
// 2. a[][] is rectangular
// 3. a[][] may be ragged
// Your solution to b should work for a, and your solution to c should work for both b and a,
// but your code should get progressively more complicated.

public class BookEx1_4_11 {
    public static void main (String[] args) {
        int M = 4;
        int N = 5;
        int[][] a = new int[N][N];
        // populate array a
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (j+1) + (i*5);
            }
        }
        
        // print array a to test
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        // initialize and populate array b
        int[][] b = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = a[i][j];
            }
        }
        
        //print array b to test
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();   
        }   
    }
}