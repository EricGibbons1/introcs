public class BookEx1_4_3 {
    public static void main (String[] args) {
        int[] a = {3, 4, 2};
        int[] b = {4, 3, 2};
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = Math.sqrt(a[i]*a[i] + b[i]*b[i]);
            System.out.println(c[i]);
        }
    }
}