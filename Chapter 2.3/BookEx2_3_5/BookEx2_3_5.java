// Given four positive integers a, b, c, and d, explain what value is computed by gcd(gcd(a, b), gcd(c, d)).

public class BookEx2_3_5 {

    // recursive implementation
    public static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }

    public static void main(String[] args) {
        System.out.print(gcd(gcd(5, 10), gcd(10, 20)));
    }
}