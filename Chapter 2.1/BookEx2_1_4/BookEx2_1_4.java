// Write a static method eq() that takes two arrays of integers as arguments and returns true if they contain the same number of elements
// and all corresponding pairs of elements are equal, and false otherwise.

// Ryan, shouldn't eq() be two functions, length and values? Or am I missing something? w/e

public class BookEx2_1_4
{
    public static boolean eq(int[] a, int[] b)
    {
        // check if lengths are equal
        if (a.length != b.length) return false;
        
        // check if values are equal
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i]) return false;
        }
        // if neither return runs, then they are equal
        return true;
    }
    
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.print(eq(a,b));
    }
}