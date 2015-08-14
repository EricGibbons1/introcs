// Suppose that x and t are variables of type double and N is a variable of type int.
// Write a code fragment to set t to xN / N!.

public class BookEx1_3_18 {
    public static void main (String [] args) {
        double x = Double.parseDouble(args[0]);
        double t = 0;
        double N = Integer.parseInt(args[1]);
        int factorial = 1;
        for (int i = 1; i <= N; i++)
            factorial *= i;
        t = Math.pow(x,N)/factorial;
        System.out.println(Math.pow(x,N));
        System.out.println(factorial);
        System.out.print(t);
    }
}
        