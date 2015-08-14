public class BookEx1_3_4a {
    public static void main (String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        boolean both = (x > 0 && x < 1 && y > 0 && y < 1);
        System.out.print(both);
    }
}