// Permutations of size k. Modify Permutations.java to PermutationsK.java so that it takes two command-line arguments n and k,
// and prints out all P(n, k) = n! / (n-k)! permutations that contain exactly k of the n elements.

public class CreativeEx2_3_18
{
    public static int fact(int n)
    {
        if (n == 1) return 1;
        return (n * fact(n - 1));
    }
    
    public static String randomPerm(int n, int x, int k, String[] letters, boolean[] tempBooleanPerm, String[] allPerm)
    {
        String tempPerm = "";
        while (tempPerm.length() < 2)
        {
            for (int i = 0; i < k; i++)
            {
                tempPerm = tempPerm + random(n, tempBooleanPerm, letters);
            }
        }
        clear(n, tempBooleanPerm);
        if (checkPerm(n, k, tempPerm, allPerm)) return randomPerm(n, x, k, letters, tempBooleanPerm, allPerm);
        allPerm[x] = tempPerm;
        return tempPerm;
    }
    
    public static void clear(int n, boolean[] tempBooleanPerm)
    {
        for (int i = 0; i < n; i++) tempBooleanPerm[i] = false;
    }
    
    public static String random(int n, boolean[] tempBooleanPerm, String[] letters)
    {
       int random = (int) (Math.random() * n);
       if (tempBooleanPerm[random] == false)
       {
           tempBooleanPerm[random] = true;
           return letters[random];
       }
       return random(n, tempBooleanPerm, letters);
     }
    
    public static boolean checkPerm(int n, int k, String tempPerm, String[] allPerm)
    {
        for (int i = 0; i < (fact(n)/fact(n-k)); i++)
        {
            if (tempPerm.equals(allPerm[i])) return true;
        }
        return false;
    }
       
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] allPerm = new String[fact(n)/fact(n-k)];
        boolean[] tempBooleanPerm = new boolean[n];
        
        for (int x = 0; x < (fact(n)/fact(n-k)); x++)
        {
            System.out.println(randomPerm(n, x, k, letters, tempBooleanPerm, allPerm));
        }
        
    }
}