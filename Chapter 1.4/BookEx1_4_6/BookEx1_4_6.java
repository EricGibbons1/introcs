// Write a code fragment that prints the contents of a two-dimensional boolean array, using * to represent true and a space to
// represent false. Include row and column numbers.

public class BookEx1_4_6 {
    public static void main (String[] args) {
        int M = 10;
        int N = 5;
        boolean[][] array = new boolean[M][N];
        System.out.print("  "); //print the spacer for the row numbers
        for (int j = 0; j < N; j++){
            System.out.print(j + " "); //print the column number
        }
        
        for (int i = 0; i < M; i++) {
            System.out.print("\n" + i + " ");
            for (int j = 0; j < N; j++) {
                if (((i == 0 || i % 2 == 0) && (j == 0 || j % 2 == 0)) || ((i == 1 || i % 2 == 1) && (j == 1 || j % 2 == 1))) array[i][j] = true;
                if (array[i][j]) System.out.print("* ");
                else System.out.print("+ ");
            }
        }
    }
}
                