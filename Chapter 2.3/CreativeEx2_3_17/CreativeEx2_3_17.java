// Write a program Permutations.java that take a command-line argument n and prints out all n! permutations of the n letters
// starting at a (assume that n is no greater than 26). A permutation of n elements is one of the n! possible orderings of the elements.
// As an example, when n = 3 you should get the following output. Do not worry about the order in which you enumerate them.

public class CreativeEx2_3_17
{
    public static int fact(int n)
    {
        if (n == 1) return 1;
        return (n * fact(n - 1));
    }
    
    public static String randomPerm(int n, int x, String[] letters, boolean[] tempBooleanPerm, String[] allPerm)
    {
        String tempPerm = "";
        for (int i = 0; i < n; i++)
        {
            tempPerm = tempPerm + random(n, tempBooleanPerm, letters);
        }
        clear(n, tempBooleanPerm);
        if (checkPerm(n, tempPerm, allPerm)) return randomPerm(n, x, letters, tempBooleanPerm, allPerm);
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
    
    public static boolean checkPerm(int n, String tempPerm, String[] allPerm)
    {
        for (int i = 0; i < fact(n); i++)
        {
            if (tempPerm.equals(allPerm[i])) return true;
        }
        return false;
    }
       
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] allPerm = new String[fact(n)];
        boolean[] tempBooleanPerm = new boolean[n];
        
        for (int x = 0; x < fact(n); x++)
        {
            System.out.println(randomPerm(n, x, letters, tempBooleanPerm, allPerm));
        }
        
    }
}