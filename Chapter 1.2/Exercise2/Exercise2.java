public class Exercise2 {
    public static void main (String[] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double r = sin*sin + cos*cos;
        System.out.println("cos^2(" + radians +") + sin^2(" + radians + ") = " + (sin*sin + cos*cos) + ", which is hopefully close to 1");
    }
}