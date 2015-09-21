// Implement a data type Die for rolling a fair die, say with 6 sides. Include a mutator method roll() and an accessor method value.

public class Die
{
    private int side;
    
    public Die(int sides)
    {
        side = sides;
    }
    
    public int roll()
    {
        return 1 + (int) (Math.random() * side);
    }
    
    public static void main(String[] args)
    {
        Die die1 = new Die(6);
        for (int i = 0; i < 20; i++) System.out.println(die1.roll());
    }
}
