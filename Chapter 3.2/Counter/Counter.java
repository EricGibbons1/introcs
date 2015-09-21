// Implement a mutable data type Counter.

public class Counter
{ // x is initial value, t is new value
    private int x0, xt;
    public Counter(int x, int t)
    { x0 = x; xt = t;}
    
    public void increaseCount()
    { xt += 1; }
    
    public int totalIncrease()
    { return (xt-x0); }
    
    public String toString()
    { return "test: (" + x0 + ", " + xt + ")"; }
    
    public int start()
    { return x0; }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Counter test = new Counter(N,N);
        for (int i = test.start(); i < 1001; i++)
            if (i % 10 == 0) test.increaseCount();
        System.out.println(test.totalIncrease());
        System.out.println(test.toString());
    }
}