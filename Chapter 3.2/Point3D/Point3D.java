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
    
    public static double distance(Point3D point1, Point3D point2)
    {
        int distx = point1.x() - point2.x();
        int disty = point1.y() - point2.y();
        int distz = point1.z() - point2.z();
        return Math.sqrt(distx * distx + disty * disty + distz * distz);
    }
    
    public static double distanceSquared(Point3D point1, Point3D point2)
    {
        return distance(point1, point2) * distance(point1, point2);
    }
    
    public static int distanceL1(Point3D point1, Point3D point2)
    {
        int distx = Math.abs(point1.x() - point2.x());
        int disty = Math.abs(point1.y() - point2.y());
        int distz = Math.abs(point1.z() - point2.z());
        return distx + disty + distz;
    }
    
    public static void main(String[] args)
    {
        Point3D point1 = new Point3D(1, 1, 1);
        Point3D point2 = new Point3D(5, 5, 5);
        System.out.println(distance(point1, point2));
        System.out.println(distanceSquared(point1, point2));
        System.out.println(distanceL1(point1, point2));
    }
}
        