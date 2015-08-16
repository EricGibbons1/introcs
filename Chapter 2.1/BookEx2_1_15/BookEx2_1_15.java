//  Implement the function f and write a program to take a 10-digit integer as a command-line argument and print a valid 11-digit number
// with the given integer as its first 10 digits and the checksum as the last digit.

public class BookEx2_1_15
{
    public static int sum(long a)
    {
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            double digit = ((a % Math.pow(10, i + 1)) - prev) / Math.pow(10,i);
            prev += (digit * Math.pow(10, i));
            if (i == 1 || i % 2 == 1) sum += digit;
            if (i == 0 || i % 2 == 0)
            {
                digit = digit * 2;
                while (digit > 9)
                {
                    digit = 1 + (digit - 10);
                }
                sum += digit;
            }
        }
        return sum;
    }
    
    public static int check(int sum)
    {
        int check = (sum * 9) % 10;
        return check;
    }
    
    public static void main(String[] args)
    {
        long a = Long.parseLong(args[0]);
        StdOut.print("The sum is " + sum(a) + ", and the check is " + check(sum(a)));
    }
}
        
                
        
            
            
