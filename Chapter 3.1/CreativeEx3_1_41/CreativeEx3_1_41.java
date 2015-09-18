// The game of Boggle is played on a 4-by-4 grid of characters. There are 16 dice, each with 6 letters on the them.
// Create a 4-by-4 grid, where each die appears in one of the cells at random, and each die displays one of the 6 characters at random.

public class CreativeEx3_1_41
{ // I don't know if I did this wrong but this seems extremely straightforward; just a 4x4 matrix of random six letter uppercase strings
    public static void main(String[] args)
    {
        String[][] boggle = new String[4][4];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                String cube = "";
                for (int k = 0; k < 6; k++)
                {
                    cube += alphabet.charAt((int) (Math.random() * 26));
                }
                System.out.print(cube.toUpperCase() + " ");
            }
            System.out.println();
        }
    }
}
                
            