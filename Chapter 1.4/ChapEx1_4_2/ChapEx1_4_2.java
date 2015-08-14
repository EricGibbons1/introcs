public class ChapEx1_4_2 {
    public static void main (String[] args) {
        // generate random values in (0..N) until finding each one
        int N = Integer.parseInt(args[0]);
        boolean[] found = new boolean[N];
        int cardcount = 0, valuecount = 0;
        
        while (valuecount < N) {
            // generate another value
            int val = (int) (Math.random() * N);
            cardcount++;
            if (!found[val]) {
                valuecount++;
                found[val] = true;
            }
            // N different values found
        }
        System.out.println(cardcount);
    }
}
          