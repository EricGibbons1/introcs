// Implement a mutable data type StopWatch.

public class StopWatch
{
    private long start, stop;
    private int lap;
    
    public StopWatch()
    { start = 0; stop = 0;}
    
    public void start()
    { start = System.currentTimeMillis(); }
    
    public void stop()
    {
        stop = System.currentTimeMillis();
        lap++;
    }
    
    public long timeElapsed()
    { return stop - start; }
    
    public void reset()
    {
        start = 0;
        stop = 0;
        lap = 0;
    }
    
    public int laps()
    { return lap; }
    
    public void unpause()
    { 
        long difference = start - stop;
        start = System.currentTimeMillis(); stop = start + difference;
    }
    
    public static void main(String[] args)
    {
        StopWatch test = new StopWatch();
        test.start();
        int sum = 0;
        for (int i = 0; i < 10000000; i++)
            sum *= i;
        test.stop();
        System.out.println(test.timeElapsed());
        System.out.println(test.laps());
    }
}
    
    