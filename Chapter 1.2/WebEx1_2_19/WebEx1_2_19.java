public class WebEx1_2_19 {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double c = Math.random();
        System.out.println((int) ((c *(1 + b - a)) + a));
    }
}
        