// Write a code fragment Transpose.java to transpose a square two-dimensional array in place without creating a second array.

public class BookEx1_4_13 {
    public static void main (String[] args) {
        int N = 5;
        int[][] a = new int[N][N];
        // populate array a
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (j+1) + (i*5);
            }
        }
        // print what the transposition will look like
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        // do the transposition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {     
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        // print it again to see if it matches
         for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }       
        
    }
}