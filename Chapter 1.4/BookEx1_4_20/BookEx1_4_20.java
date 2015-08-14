// Dice simulation. The following code computes the exact probability distribution for the sum of two dice:
// The value dist[k] is the probability that the dice sum to k. Run experiments to validate this calculation simulating N dice throws,
// keeping track of the frequencies of occurrence of each value when you compute the sum of two random integers between 1 and 6.
// How large does N have to be before your empirical results match the exact results to three decimal places?

public class BookEx1_4_20 {
    public static void main (String[] args) {
        // calculate the probability of dice throws
        double[] dist = new double[13]; 
        for (int i = 1; i <= 6; i++) 
            for (int j = 1; j <= 6; j++) 
            dist[i+j] += 1.0; 
        for (int k = 2; k <= 12; k++) {
            dist[k] /= 36.0;
            System.out.print(dist[k] + " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        // throw dice N times
        int N = Integer.parseInt(args[0]);
        double[] toss = new double[11];
        for (int i = 0; i < N; i++) {
            int dice1 = (int) (1 + (Math.random() * 6));
            int dice2 = (int) (1 + (Math.random() * 6));
            toss[dice1 + dice2 - 2] += 1;
        }
        for (int i = 0; i < toss.length; i++) {
            toss[i] /= N;
            System.out.print(toss[i] + " ");
        }
    }
}
        