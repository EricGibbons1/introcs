public class WebEx1_2_29 {
    public static void main (String[] args) {
        //Write a program DayOfWeek.java that takes a date as input and prints the day
        // of the week that date falls on. Your program should take three command-line
        // arguments: m (month), d (day), and y (year). For m use 1 for January, 2
        // for February, and so forth. For output print 0 for Sunday, 1 for Monday,
        // 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar:
        // y0 = y - (14 - m) / 12
        //x = y0 + y0/4 - y0/100 + y0/400
        //m0 = m + 12 * ((14 - m) / 12) - 2
        //d0 = (d + x + (31*m0)/ 12) mod 7
        
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        int y0 = y - (14 - m) / 12;
        int x = y0 +y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12 ) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;
        if (d0 == 0) {
            System.out.println("That was a Sunday!");
        } else if (d0 == 1) {
            System.out.println("That was a Monday!");
        } else if (d0 == 2) {
            System.out.println("That was a Tuesday!");
        } else if (d0 == 3) {
            System.out.println("That was a Wednesday!");
        } else if (d0 == 4) {
            System.out.println("That was a Thursday!");
        } else if (d0 == 5) {
            System.out.println("That was a Friday!");
        } else if (d0 == 6) {
            System.out.println("That was a Saturday!");
        }
    }
}
        
