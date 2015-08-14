public class BookEx1_3_4 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i<=N; i++) {
            System.out.print(i+" "); }
        System.out.println();
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((j % i == 0) || (i % j == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}