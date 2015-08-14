public class BookEx1_3_6a {
    public static void main (String[] args) {
        int i, j;
        for (i = 0, j = 0; i < 10; i++) {
            j += j++;
            System.out.println(j); }
    }
}