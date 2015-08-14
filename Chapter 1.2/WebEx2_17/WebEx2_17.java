public class WebEx2_17 {
    public static void main (String[] args) {
        int a = 1;
        a = a + a;
        System.out.println(a + " should be 2");
        a = a + a;
        System.out.println(a + " should be 4");
        a = a + a;
        System.out.println(a + " should be 8");
        
        boolean b = true;
        b = !b;
        System.out.println(b + " should be false");
        b = !b;
        System.out.println(b + " should be true");
        b = !b;
        System.out.println(b + " should be false");
        
        int c = 2;
        c = c * c;
        System.out.println(c + " should be 4");
        c = c * c;
        System.out.println(c + " should be 16");
        c = c * c;
        System.out.println(c + " should be 256");
    }
}
        
        