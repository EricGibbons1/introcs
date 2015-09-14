// pushes out numbers in pairs, seemingly -- it took my a while to just write out what happens.
// Goes from 0 to 8. Doesn't seem intuitive to me though

public class BookEx2_3_7
{
    public static void mystery(int a, int b) 
    {
        if (a <= b) 
        {
            int m = (a + b) / 2;
            mystery(a, m - 1);
            StdOut.println(m);
            mystery(m + 1, b);
        }
    }
    
    public static void main(String[] args)
    {
        mystery(0,8);
    }
}
