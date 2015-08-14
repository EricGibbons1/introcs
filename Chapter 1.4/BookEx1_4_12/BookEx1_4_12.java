// Write a code fragment to print the transposition (rows and columns changed) of a square two-dimensional array.
// For the example spreadsheet array in the text, you code would print the following:

public class BookEx1_4_12 {
    public static void main (String[] args) {
        int[][] a = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
