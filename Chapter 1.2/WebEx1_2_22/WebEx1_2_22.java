public class WebEx1_2_22 {
    public static void main (String[] args) {
        // Write a program that takes three double values x0, v0, and t from the 
        // command line and prints the value of x0 + v0*t + 1/2 gt^2
        // where g is the constant 9.800722 m/s^2. 
        // (Note : This value the displacement in meters after t seconds when an
        // object is thrown straight up from initial position x0 at velocity v0
        // meters per second.)
        
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double equation = x0 + v0 * t - 0.5 * t * t * 9.800722;
        System.out.println(equation);
    }
}