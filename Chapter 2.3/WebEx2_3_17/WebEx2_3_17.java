// 0 since they flip flop back and forth

public class WebEx2_3_17
{
   public static int f(int n)
   {
       if (n == 0) return 0;            
       return f(n-1) + g(n-1);          
   }
   
   public static int g(int n)
   {
       if (n == 0) return 0;
       return g(n-1) + f(n);
   }
   
   public static void main(String[] args)
   {
       System.out.println(g(g(2)));
   }
}

   