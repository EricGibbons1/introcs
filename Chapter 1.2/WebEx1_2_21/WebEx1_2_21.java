public class WebEx1_2_21 {
    public static void main (String[] args) {
        double t = Double.parseDouble(args[0]);
        int radians = (int) Math.toRadians(t);
        double sum = Math.sin(2*t) + Math.sin(3*t);
        System.out.println(sum);
    }
}