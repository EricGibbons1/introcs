public class BookEx2_3_14
{
    public static void mystery(int n) {
        if (n < 2) return;
        mystery(n-2);
        StdOut.println(n);
        mystery(n-1);
    }
    
    public static void main(String[] args)
    {
        mystery(6);
    }
}

// 2, 4, 3, 2, 6, 3, 2, 5, 2, 4, 3, 2
// nailed it, but still had to write it out. I don't have the hang of predicting the outcomes yet