public class WebEx2 {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;
        System.out.println(a + ", " + b + ", " + c);
        c = a;
        a = b;
        System.out.println(a + ", " + b + ", " + c);
        b = c;
        c = 0;
        System.out.println(a + ", " + b + ", " + c);
    }
}