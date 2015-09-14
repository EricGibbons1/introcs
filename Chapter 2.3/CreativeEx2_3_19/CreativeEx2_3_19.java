// Combinations. Write a program Combinations.java that takes one command-line argument n and prints out all 2^n combinations of any size
// A combination is a subset of the n elements, independent of order. As an example, when n = 3 you should get the following output.
//  a ab abc ac b bc c

public class CreativeEx2_3_19
{
    
    
    public static String randomPerm(int n, int x, String[] letters, boolean[] tempBooleanPerm, String[] allPerm)
    {
        String tempPerm = "";
        for (int i = 0; i < n; i++)
        {
            tempPerm = tempPerm + random(n, tempBooleanPerm, letters);
            if (checkPerm(n, tempPerm, allPerm))
            {
                allPerm[x] = tempPerm;
                clear(n, tempBooleanPerm);
                return randomPerm(n, x, letters, tempBooleanPerm, allPerm);
            }
        }
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
        for (int i = 0; i < Math.pow(2,n); i++)
        {
            if (tempPerm.equals(allPerm[i])) return true;
        }
        return false;
    }
       
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] allPerm = new String[(int) Math.pow(2,n)];
        boolean[] tempBooleanPerm = new boolean[n];
        
        for (int x = 0; x < Math.pow(2,n); x++)
        {
            System.out.println(randomPerm(n, x, letters, tempBooleanPerm, allPerm));
        }
        
    }
}