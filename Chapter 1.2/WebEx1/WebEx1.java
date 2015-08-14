public class WebEx1 {
    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int dsqrd = (x*x + y*y);
        double d = Math.sqrt(dsqrd);
        System.out.println(d);
    }
}