// Euler's sum-of-powers conjecture. In 1769 Leonhard Euler formulated a generalized version of Fermat's Last Theorem,
// conjecturing that at least n nth powers are needed to obtain a sum that is itself an nth power, for n > 2.
// Write a program to disprove Euler's conjecture (which stood until 1967), using a quintuply nested loop to find four positive
// integers whose 5th power sums to the 5th power of another positive integer.
// That is, find a, b, c, d, and e such that a^5 + b^5 + c^5 + d^5 = e^5. Use the long data type.

public class BookEx1_3_44 {
    public static void main (String[] args) {
        for (long a = 1; a <= 200; a++) {
            long a5 = a*a*a*a*a;
            if (a5 > Math.pow(200,5)) break;
            
            for (long b = 1; b <= 200; b++) {
                long b5 = b*b*b*b*b;
                if (b5 > Math.pow(200,5)) break;
                
                for (long c = 1; c <= 200; c++) {
                    long c5 = c*c*c*c*c;
                    if (c5 > Math.pow(200,5)) break;
                    
                    for (long d = 1; d <= 200; d++) {
                        long d5 = d*d*d*d*d;
                        if (d5 > Math.pow(200,5)) break;
                        
                        for (long e = 1; e <= 200; e++) {
                            long e5 = e*e*e*e*e;
                            if (e5 > Math.pow(200,5)) break;
                            if (e5 == a5 + b5 + c5 + d5) {
                                System.out.println(e5 + " = " + a5 + " + " + b5 + " + " + c5 + " + " + d5);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}

            