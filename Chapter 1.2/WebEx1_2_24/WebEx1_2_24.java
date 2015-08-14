public class WebEx1_2_24 {
    public static void main (String[] args) {
        // Loan payments. Write a program that calculates the monthly payments
        // you would have to make over a given number of years to pay off a loan
        // at a given interest rate compounded continuously, taking the number of
        // years t, the principal P, and the annual interest rate r as command-line
        // arguments. The desired value is given by the formula Pe^(rt). Use Math.exp().
        
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double interest = Double.parseDouble(args[2]);
        double formula = (principal * 1* Math.exp(interest*years))/(12*years);
        System.out.println(formula);
    }
}