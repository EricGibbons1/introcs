// FYI Ryan I was right

public class BookEx2_1_14
{
    public static String duplicate(String s) {
        String t = s + s;
        return t;
    }
    
    public static void main(String[] args)
    {
        String s = "Hello";
        s = duplicate(s);
        String t = "Bye";
        t = duplicate(duplicate(duplicate(t)));
        System.out.println(s + t);
    }
}
    