// Give the value of ex234(6):
// public static String ex234(int n) {
    // if (n <= 0) return "";
    // return ex234(n-3) + n + ex234(n-2) + n;
//}

//ex234(6) --> ex234(3) + 6 + ex234(4) + 6
//ex234(3) + 6 + ex234(4) + 6 --> ex234(0) + 3 + ex234(1) + 3 + 6 + ex234(1) + 4 + ex234(2) + 4
//ex234(0) + 3 + ex234(1) + 3 + 6 + ex234(1) + 4 + ex234(2) + 4 --> 
public class BookEx2_3_4
{
    public static String ex234(int n)
    {
        if (n <= 0) return "";
        return ex234(n-3) + n + ex234(n-2) + n;
    }
    
    public static void main(String[] args)
    {
        System.out.println(ex234(6));
        System.out.print(3 + "" + 1 + "" + 1 + "" + 3 + "" + 6 + "" + 1 + "" + 1 + "" + 4 + "" + 2 + "" + 2 + "" + 4 + "" + 6 + "");
    }
}
