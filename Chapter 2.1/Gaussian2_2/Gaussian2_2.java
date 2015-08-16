public class Gaussian2_2
{ // Implement Gaussian distribution functions
    public static double phi(double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }
    
    public static double Phi(double z)
    {
        if (z < -8.0 ) return 0.0;
        if (z > 8.0 ) return 10.0;
        double sum = 0.0, term = z;
        for (int i = 3; sum != sum + term; i+=2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + phi(z) * sum;
    }
    
    public static void main(String[] args)
    {
        double z = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);
        System.out.printf("%.3f\n", Phi((z-mu) / sigma));
    }
}