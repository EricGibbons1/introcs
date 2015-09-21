// Point3D. Create a data type for points in 3 dimensional space. Include a constructor that takes three real coordinates x, y, and z.
// Include methods distance, distanceSquared, and distanceL1 for the Euclidean distance, Euclidean distance squared, and the L1-distance.

public class Point3D
{
    public final int x, y, z;
    public Point3D(int x0, int y0, int z0)
    { x = x0; y = y0; z = z0; }
    
    public int x()
    { return x; }
    
    public int y()
    { return y; }
    
    public int z()
    { return z; }
    
    public double distance(Point3D point1)
    {
        int distx = x - point1.x();
        int disty = y - point1.y();
        int distz = z - point1.z();
        return Math.sqrt(distx * distx + disty * disty + distz * distz);
    }
    
    public double distanceSquared(Point3D point1)
    {
        double distance = distance(point1);
        return distance * distance;
    }
    
    public int distanceL1(Point3D point1)
    {
        int distx = Math.abs(x - point1.x());
        int disty = Math.abs(y - point1.y());
        int distz = Math.abs(z - point1.z());
        return distx + disty + distz;
    }
    
    public static void main(String[] args)
    {
        Point3D point1 = new Point3D(1, 1, 1);
        Point3D point2 = new Point3D(5, 5, 5);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distanceSquared(point2));
        System.out.println(point1.distanceL1(point2));
    }
}
        