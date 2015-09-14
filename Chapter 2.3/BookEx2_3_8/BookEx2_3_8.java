// does nothing, has no return statement

public class BookEx2_3_8
{
    public static int mystery(int a, int b)
    {
        if (a == b) StdOut.println(a);
        else {
            int m1 = (a + b    ) / 2;
            int m2 = (a + b + 1) / 2;
            mystery(a, m1);
            mystery(m2, b);
        }
    }
    
    public static void main(String[] args)
    {
        mystery(0,8);
    }
}