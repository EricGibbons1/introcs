// Given the positions and masses of a sequence of objects, write a progrm to compute their center-of-mass or centroid.
// The centroid is the average position of the N objects, weighted by mass. If the positions and masses are given by (xi, yi, mi), then
// the centroid (x, y, m) is given by:
// m  = m1 + m2 + ... + mN
// x  = (m1x1 +  ... + mnxN) / m
// y  = (m1y1 +  ... + mnyN) / m
// Write a program Centroid.java that reads in a sequence of positions and masses (xi, yi, mi) from standard input and prints out their
// center of mass (x, y, m). Hint: model your program after Average.java.

public class BookEx1_5_16 {
    public static void main(String[] args) {
        double m = 0;
        double x = 0;
        double y = 0;
        
        while (!StdIn.isEmpty()) {
            double xi = StdIn.readInt();
            double yi = StdIn.readInt();
            double mi = StdIn.readInt();
            m += mi;
            x += xi;
            y += yi;
        }
        
        x = x/m;
        y = y/m;
        
        StdOut.print("Centroid dimensions are: (" + x + ", " + y + ", " + m + ").");
    }
}
        
            