// Write a program that takes a command-line argument N, reads in N-1 distinct integers between 1 and N,
// and determines the missing value.


public class BookEx1_5_7 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] set = new boolean[N];
        
        while (!StdIn.isEmpty()) {
            int number = StdIn.readInt();
            set[(number-1)] = true;
        }
        
        for (int i = 0; i < N; i++) {
            if (set[i] == false) {
                StdOut.println(i+1 + " is missing!");
            }
        }
    }
}

            
        
        