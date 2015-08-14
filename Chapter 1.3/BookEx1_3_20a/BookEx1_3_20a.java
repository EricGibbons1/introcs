public class BookEx1_3_20a {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        int binary = 1;
        for (int i = 1; N >= Math.pow(2,i); i++) {
            binary *= 10;
        }
        System.out.println(binary);
    }
}