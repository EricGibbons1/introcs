public class LeapYear {
    public static void main (String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        
        // divides by 4
        isLeapYear = (year % 4 == 0);
        
        // except during centuries
        isLeapYear = isLeapYear && (year % 100 != 0);
        
        // but include every 400 years!
        isLeapYear = isLeapYear || (year % 400 == 0);
        
        System.out.println(isLeapYear);
    }
}
