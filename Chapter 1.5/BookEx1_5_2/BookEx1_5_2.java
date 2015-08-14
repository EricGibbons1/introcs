// Modify your program from the previous exercise to insist that the integers must be positive
// (by prompting the user to enter positive integers whenever the value entered is not positive).

public class BookEx1_5_2 {
    public static void main(String[] args) {
        int max = StdIn.readInt();
        int min = max;
        while (!StdIn.isEmpty()) {
            int number = StdIn.readInt();
            if (number < 0) {
                StdOut.println("Please remove " + number + " and enter a number > 1");
                continue;
            }
            if (number < min) min = number;
            if (number > max) max = number;
            if
        }
        StdOut.println("Max is " + max + ", and Min is " + min);
    }
}