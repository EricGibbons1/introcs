// Write a program LongestRun.java that reads in a sequence of integers and prints out both the integer that appears in a longest
// consecutive run and the length of the run. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should print
// Longest run: 4 consecutive 7s.

public class BookEx1_5_5 {
    public static void main(String[] args) {
        int prev = StdIn.readInt();
        int length = 1;
        int best = prev;
        int longLength = length;          

        while (!StdIn.isEmpty()) {
            int next = StdIn.readInt();
            if (next == prev) {
                length++;
            }
            else {
                prev = next;
                length = 1;
            }
            if (length > longLength) {
                longLength = length;
                best = next;
            }
        }
        StdOut.print("Longest run: " + longLength + " consecutive " + best + "s");
    }
}
                    