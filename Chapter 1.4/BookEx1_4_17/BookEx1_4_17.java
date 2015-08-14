// Write a code fragment to multiply two rectangular matrices that are not necessarily square.
// Note: For the dot product to be well-defined, the number of columns in the first matrix must be equal to the number of rows
// in the second matrix. Print an error message if the dimensions do not satisfy this condition.

public class BookEx1_4_17 {
    public static void main (String[] args) {
        int[][]a = new int[4][10];
        int[][]b = new int[10][2];
        int[][]c = new int[10][10];
        int i, j, k;
        
        // check to see if matrics
        while (a[0].length != b.length) {
            System.out.print("column count of a[][] not equal to row count of b[][]");
            break;
        }
            
        // give a[][] values
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                a[i][j] = i * j;
            }
        }
        
        // give b[][] values
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[0].length; j++) {
                b[i][j] = i * j;
            }
        }        
        
        // multiply a[][] and b[][] to get values for c[][]
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b[0].length; j++) {
                for (k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        // print column values for c[][]
        System.out.print(" ");
        for (i = 0; i < c[0].length; i++)
            System.out.print(" " + i);
        System.out.println();
       

        // print c[][]
        for (i = 0; i < c.length; i++) {
            System.out.print(i + " ");
            for (j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
        
        
        
        
        