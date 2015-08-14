public class WebEx1_2_23 {
    public static void main (String[] args) {
        // Write a program SpringSeason.java that takes two int values
        // m and d from the command line and prints true if
        // day d of month m is between March 20 (m = 3, d =20)
        // and June 20 (m = 6, d = 20), false otherwise.
        
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean summer = ((m==3 && d>20 && d<32) || (m>3 && m<6 && d>0 && d<32) || (m==6 && d<20));
        System.out.println(summer);
    }
}
            
            