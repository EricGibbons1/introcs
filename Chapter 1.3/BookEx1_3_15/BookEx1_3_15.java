public class BookEx1_3_15 {
    public static void main (String[] args) {
        int N = 1000000;
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum = sum + 1 / (1.0 * i * i);
        System.out.println(sum);
        System.out.print(Math.PI*Math.PI/6);
    }
}