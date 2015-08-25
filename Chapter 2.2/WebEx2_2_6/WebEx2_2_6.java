// Random point on a sphere. Use StdRandom.gaussian() to generate a random point on the surface of a sphere or hypersphere:
// generate N random values from the gaussian distribution, x[0], ..., x[N-1].
// Then (x[0]/scale, ..., x[N-1]/scale) is a random point on the N-dimensional sphere, where scale = sqrt(x[0]^2 + ... + x[N-1]^2).

// Ryan I have very little idea what this is talking about but tried anyway
import java.util.Arrays;
public class WebEx2_2_6
{
    // calculate the random gaussian values
    public static double[] gaussianValues(int N)
    {
        double[] values = new double[N];
        for (int i = 0; i < N; i++)
        {
            values[i] = StdRandom.gaussian();
        }
        return values;
    }
    
    // calculate scale
    public static double gaussianScale(double[] values)
    {
        double scale = 0;
        for (int i = 0; i < values.length; i++)
        {
            scale += values[i] * values[i];
        }
        scale = Math.sqrt(scale);
        return scale;
    }
    
    // calculate gaussian point
    public static double[] gaussianPoint(double[] values, double scale)
    {
        double[] point = new double[values.length];
        for (int i = 0; i < values.length; i++)
        {
            point[i] = values[i] / scale;
        }
        return point;
    }      
    
    public static void main(String[] args)
    {
        // keep track of return values from methods
        int N = Integer.parseInt(args[0]);
        double[] values = gaussianValues(N);
        double scale = gaussianScale(values);
        double[] point = gaussianPoint(values, scale);
        System.out.print("Random point coordinates are: ");
        System.out.print(Arrays.toString(point));
    }
}

    