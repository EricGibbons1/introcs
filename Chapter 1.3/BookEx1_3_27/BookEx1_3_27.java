// Write a program Checkerboard.java that takes one command-line argument N and
// prints out a two dimensional N-by-N checkerboard pattern with alternating spaces
// and asterisks, like the following 4-by-4 pattern.

public class BookEx1_3_27 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= N) {
            int x = 1;
            if (i % 2 == 1) {
                while (x <= N) {
                    System.out.print("* ");
                    x++;
                }
            }
            else {
                while (x <= N) {
                    System.out.print(" *");
                    x++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
                