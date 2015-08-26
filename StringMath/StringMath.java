// test to see if string b is a rotation of string a
import java.lang.String;

public class StringMath
{
    // split b into substrings and check a
    public static boolean test1(String a, String b)
    {
        boolean test1 = false;
        for (int i = 0; i < a.length(); i++)
        {
            String c = b.substring(i) + (b.substring(0,i));
            if (c.equals(a))
                {
                    test1 = true;
                }
        }
        return test1;
    }
    // double a and see if b occurs in the double length a (this could be written in one line!!!!!)
    public static boolean test2(String a, String b)
    {
        String c = a + a;
        boolean test2 = (c.indexOf(b) > 0);
        return test2;
    }
    
    public static void main(String[] args)
    {
        String a = "abcde";
        String b = "cdeab";
        System.out.println("Test1 proved " + test1(a, b));
        System.out.println("Test2 proved " + test2(a, b));
    }
}