// After coming up with my extremely ghetto (but possibly accurate?) solution I googled this and found some proof involving the golden
// ratio. This looks hard. Unfortunately they solved it for 10,000,000,000 and I can't enter that number to check my answer. :\
// A tricky recurrence. Define F(n) so that F(0) = 0 and F(n) = n - F(F(n-1)). What is F(100000000)?

public class WebEx2_3_30
{
    public static long tricky(long n)
    {
        if (n == 0) return 0;
        if ((n+4) % 5 <=1) return n - tricky(n-(1+2*((int) (n/5))));
        return n - tricky(n-(2+2*((int) (n/6))));
    }
    
    public static void main(String[] args)
    {
        long n = Long.parseLong(args[0]);
        for (int i = 0; i< n; i++) System.out.println(tricky(i));
    }
}

    // f(0) = 0;
    // f(1) = 1 - f(f(0)); 1 - f(0); 1 - 0; 1; n - f(n-1); 1 1+4/5 = 0
    // f(2) = 2 - f(f(1)); 2 - f(1); 2 - 1; 1; n - f(n-1); 2 2+4/5 = 1
    // f(3) = 3 - f(f(2)); 3 - f(1); 3 - 1; 2; n - f(n-2); 3 3+4/5 = 2
    // f(4) = 4 - f(f(3)); 4 - f(2); 4 - 1; 3; n - f(n-2); 4 4+4/5 = 3
    // f(5) = 5 - f(f(4)); 5 - f(3); 5 - 2; 3; n - f(n-2); 5 5+4/5 = 4
    // f(6) = 6 - f(f(5)); 6 - f(3); 6 - 2; 4; n - f(n-3); 6 6+4/5 = 0
    // f(7) = 7 - f(f(6)); 7 - f(4); 7 - 3; 4; n - f(n-3); 7
    // f(8) = 8 - f(f(7)); 8 - f(4); 8 - 3; 5; n - f(n-4); 8
    // f(9) = 9 - f(f(8)); 9 - f(5); 9 - 3; 6; n - f(n-4); 9
    // f(10) = 10 - f(f(9); 10 - f(6); 10 - 4; 6; n - f(n-4); 10
    
                   
                       
        
    
    