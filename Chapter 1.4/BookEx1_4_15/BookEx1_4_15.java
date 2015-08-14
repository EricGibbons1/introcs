// Write a program that computes the product of two square matrices of boolean values,
// using the or operation instead of + and the and operation instead of *.

public class BookEx1_4_15 {
    public static void main (String[] args) {
        int n = 3;
        boolean[][] a = new boolean[n][n];
        boolean[][] b = new boolean[n][n];
        boolean[][] c = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                a[i][j] = true;
                b[i][j] = true;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                c[i][j] = c[i][j] || (a[i][k] && b[k][j]);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }        
    }
}