// Implement a mutable data type Odometer.

public class Odometer
{ // x is starting point, d is distance, v = constant velocity, t = duration of time in minutes
    private double rx, rd, rv;
    
    public Odometer(double x0, double d0, double v0)
    { rx = x0; rd = d0; rv = v0;}
    
    public void increaseSpeed(int v, int t)
    { rv += v; rd += t/60 * v; }
    
    public void decreaseSpeed(int v, int t)
    { rv -= v; rd += t/60 * v; }
    
    public double distance()
    { return rd; }
    
    public String status()
    { return "The car is going " + rv + " mph and has gone " + rd + " miles."; }
    
    public static void main(String[] args)
    {
        Odometer newCar = new Odometer(0, 0, 0);
        newCar.increaseSpeed(30, 60);
        newCar.increaseSpeed(60, 60);
        newCar.decreaseSpeed(60, 60);
        System.out.print(newCar.status());
    }
}
        
    
    
        
        