// Kama-sutra cipher. The Kama-sutra, written in the fourth century BCE by Vatsyayana, outlines 64 arts that women should study.
// Each letter in the alphabet is paired up with another one, as in the table below:
// A B C E F G H K L M N P R
// Q D Z U J I X Y W S O V T
// For example, the message "MEET AT ELEVEN" is encoded as "SUUR QR UWUPUO"

import java.util.Scanner;
public class CreativeEx3_1_23
{
    public static String encode(String text)
    {
        String code = "";
        String secret1 = "abcefghklmnpr ";
        String secret2 = "qdzujixywsovt ";
        for (int i = 0; i < text.length(); i++)
        {
            if (secret1.contains(text.valueOf(text.charAt(i))))
            {
                code += secret2.charAt(secret1.indexOf(text.valueOf(text.charAt(i))));
            }
            else code += secret1.charAt(secret2.indexOf(text.valueOf(text.charAt(i))));
        }
        return code.toUpperCase();
    }
        
            
        
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = "";
        while (input.hasNext()) text += input.nextLine().toLowerCase();
        System.out.print(encode(text));
    }
}
        