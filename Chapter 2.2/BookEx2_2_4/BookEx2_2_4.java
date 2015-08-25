// Add to StdRandom.java a method shuffle() that takes an array of double values as argument and rearranges them in random order.
// Implement a test client that checks that each permutation of the array is produced about the same number of times.
import java.util.*;

public class BookEx2_2_4
{
    //shuffle the array "shuffleArray"
    public static void shuffle(Double[] shuffleArray, int N)
    {
        for (int i = 0; i < N; i++)
        {
            int r = i + (int) (Math.random() * (N - i));
            double temp = shuffleArray[i];
            shuffleArray[i] = shuffleArray[r];
            shuffleArray[r] = temp;
        }
    }
    
    // find the average of array "shuffleArray"
    public static double average(Double[] shuffleArray, int N)
    {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < N; i++)
        {
            sum += shuffleArray[i];
        }
        avg = sum/N;
        return avg;
    }
    // see if the permutations happen randomly (i.e. the values of each element should average to the actual average of the array)
    public static double[] shuffletest(Double[] shuffleArray, double avg, int N)
    {
        double[] shuffleAverage = new double[N];
        for (int i = 0; i < 100000; i++)
        {
            shuffle(shuffleArray, N);
            for (int j = 0; j < N; j++)
            {
                shuffleAverage[j] += shuffleArray[j];
            }
        }
        for (int i = 0; i < N; i++)
        {
            shuffleAverage[i] /= 100000;
        }
        return shuffleAverage;
    }
        
    
    public static void main(String[] args)
    {
        // make a list of double values
        LinkedList<Double> shuffleList = new LinkedList<Double>();
        
        // scan for new values, add them to the list, count the size
        Scanner shuffleInput = new Scanner(System.in);
        while (shuffleInput.hasNext())
        {
            shuffleList.add(shuffleInput.nextDouble());
        }
        int N = shuffleList.size();
        
        // convert the list to an array, transfer over list values
        Double[] shuffleArray = shuffleList.toArray(new Double[N]);
        for (int i = 0; i < N; i++)
        {
            shuffleArray[i] = shuffleList.get(i);
        }
        
        // store the values of the methods
        double avg = average(shuffleArray, N);
        double[] shuffleAverage = shuffletest(shuffleArray, avg, N);
        
        // print out the average, and the average of each element of the shuffled array
        System.out.print("The average is: " + avg + ", and the average of each element in the array is: ");
        System.out.println(Arrays.toString(shuffleAverage));
    }
}