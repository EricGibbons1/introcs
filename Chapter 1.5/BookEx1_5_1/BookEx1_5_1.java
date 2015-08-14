// Write a program MaxMin.java that reads in integers (as many as the user enters) from standard input
// and prints out the maximum and minimum values.

public class BookEx1_5_1 {
    public static void main(String[] args) {
        int max = StdIn.readInt();
        int min = max;
        while (!StdIn.isEmpty()) {
            int number = StdIn.readInt();
            if (number < min) min = number;
            if (number > max) max = number;
        }
        StdOut.println("Max is " + max + ", and Min is " + min);
    }
}