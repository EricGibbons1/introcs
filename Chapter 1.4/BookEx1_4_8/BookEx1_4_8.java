public class BookEx1_4_8 {
    public static void main (String[] args) {
        int N = 10;
        int[] a = new int[N];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < N; i++) {
            a[i] = a[i-1] + a[i-2];
            System.out.println(a[i]);
        }
    }
}