public class BookEx1_3_3 {
    public static void main (String[] args) {
        // print the first N values of the powers of 2
        int N = Integer.parseInt(args[0]);
        int v = 1;
        for (int i = 0; i <= N; i++) {
            System.out.println(i + " " + v);
            v *= 2;
        }
    }
}