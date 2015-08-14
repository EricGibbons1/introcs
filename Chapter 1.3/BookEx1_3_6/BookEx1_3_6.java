public class BookEx1_3_6 {
    public static void main (String[] args) {
        // number to get square root of
        double c = Double.parseDouble(args[0]);
        // margin of error
        double epsilon = 1e-15;
        // estimate of c
        double t = c;
        // count of while loop
        int i = 0;
        while (Math.abs(t-c/t) > epsilon * t) {
            t = (t + c/t)/2.0;
            i++;
        }
        System.out.print("It took " + i + " iterations to arrive at answer: " + t);
    }
}