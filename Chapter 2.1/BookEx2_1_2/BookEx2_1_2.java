// Write a static method odd() that takes three boolean inputs and returns true if an odd number of inputs are true,
// and false otherwise.

public class BookEx2_1_2 
{
    public static boolean odd(boolean a, boolean b, boolean c)
    {
        int count = 0;
        boolean odd = false;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        if (count % 2 != 0) odd = true;
        return odd;
    }
    
    public static void main(String[] args)
    {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);
        System.out.print(odd(a,b,c));
    }
}

            

    