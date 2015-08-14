// Write a filter that reads in a sequence of integers and prints out the integers, removing repeated values that appear consecutively.
// For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1, your program should print out 1 2 1 5 1 7 1.

public class BookEx1_5_6 {
    public static void main(String[] args) {
        int prev = StdIn.readInt();
        StdOut.print(prev + " ");
        
        while (!StdIn.isEmpty()) {
            int next = StdIn.readInt();
            if (next == prev) continue;
            else StdOut.print(next + " ");
            prev = next;
        }
    }
}
            