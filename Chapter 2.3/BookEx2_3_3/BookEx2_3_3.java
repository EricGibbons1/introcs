// Give the sequence of integers printed by a call to ex233(6):
// public static void ex233(int n) {
    // if (n <= 0) return;
    // StdOut.println(n);
    // ex233(n-2);
    // ex233(n-3);
    // StdOut.println(n);
// }

//6 --> (6)
//4 --> 4, 2, 2, 1, 1, 4
//3 --> 3, 1, 1, 3, 6

public class BookEx2_3_3
{
    public static void ex233(int n) {
        if (n <= 0) return;
        StdOut.println(n);
        ex233(n-2);
        ex233(n-3);
        StdOut.println(n);
    }
    
    public static void main(String[] args)
    {
        ex233(6);
    }
}