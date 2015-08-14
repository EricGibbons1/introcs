// Write a code fragment that puts the binary representation of an int N into a String s.
public class BookEx1_3_20 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        String s = "";
        System.out.println(s);
        while (N > 0) {
            s = (N % 2) + s;
            N/= 2;
        }
        System.out.println(s);
    }
}