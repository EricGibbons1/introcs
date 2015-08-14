public class BookEx1_3_5 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
        System.out.println(Math.log(N)+.57721);
    }
}