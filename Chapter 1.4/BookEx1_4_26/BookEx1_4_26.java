// Hadamard matrix. The N-by-N Hadamard H(N) matrix is a boolean matrix with the remarkable property that any two rows differ in
// exactly N/2 bits. (This property makes it useful for designing error-correcting codes.) H(1) is a 1-by-1 matrix with the single entry
// true, and for N > 1, H(2N) is obtained by aligning four copies of H(N) in a large square, and then inverting all of the entries
// in the lower right N-by-N copy, as shown in the following examples (with T representing true and F representing false, as usual).

public class BookEx1_4_26 {
    public static void main (String[] args) {
        int N = (int) Math.pow(2,Integer.parseInt(args[0]));
        boolean[][] H = new boolean[N][N];
        H[0][0] = true;
        
        for (int n = 1; n < N; n += n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    H[i+n][j] = H[i][j];
                    H[i][j+n] = H[i][j];
                    H[i+n][j+n] = !H[i][j];
                }
            }
        }
        
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {
            if (H[i][j]) System.out.print("T ");
            else         System.out.print("F ");
         }
         System.out.println();
      }
   }

}                