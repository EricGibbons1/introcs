public class BookEx1_3_12 {
    public static void main (String[] args) {
        int n = 123456789;
        int m = 0;
        System.out.println("n = " + n + ", and m = " + m);
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.print("n = " + n + ", and m = " + m);
    }
}