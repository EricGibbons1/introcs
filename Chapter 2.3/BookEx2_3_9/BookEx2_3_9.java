public class BookEx2_3_9
{
    public static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return 2*f(n-2) + f(n-3);
    }
    
    public static void main(String[] args)
    {
        System.out.print(f(Integer.parseInt(args[0])));
    }
}

// 1 = 1
// 2 = 1
// 3 = 2*1 + 0 = 2
// 4 = 2*1 + 1 = 3
// 5 = 2*2 + 1 = 5
// 6 = 2*3 + 2 = 8
// fibonacci = 1, 1, 2, 3, 5, 8, etc so f(n) =  value of the nth term in a fibonacci sequence