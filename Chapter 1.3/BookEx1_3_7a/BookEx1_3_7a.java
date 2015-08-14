// Rewrite TenHellos.java to make a program Hellos.java that takes the
// number of lines to print as a command-line argument. You may assume that
// the argument is less than 1000. Hint: consider using i % 10 and i % 100
// to determine whether to use "st", "nd", "rd", or "th" for printing

public class BookEx1_3_7a {
    public static void main (String[] args) {
        int hello = Integer.parseInt(args[0]);
        int i = 0;
        for (i = 1; i < hello; i++) {
            if (i == 1 || (i % 10 == 1 && (i != 11 && i % 100 != 11))) {
                System.out.println(i + "st Hello World");
            }
                 else if (i == 2 || (i % 10 == 2 && (i != 12 && i% 100 != 12))) {
                     System.out.println(i + "nd Hello World");
                 }
                 else if (i == 3 || (i % 10 == 3 && (i != 13 && i% 100 != 13))) {
                     System.out.println(i + "rd Hello World");
                 }
                 else 
                     System.out.println(i + "th Hello World");
                }
    }
}

                