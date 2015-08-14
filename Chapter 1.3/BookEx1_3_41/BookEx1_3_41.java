// 2D random walk. A two dimensional random walk simulates the behavior of a particle moving in a grid of points.
// At each step, the random walker moves north, south, east, or west with probability 1/4, independently of previous moves.
// Determine how far away (on average) the random walker is from the starting point after N steps.
// (Theoretical answer: on the order of sqrt(N).)

public class BookEx1_3_41 {
    public static void main (String[] args) {
        int steps = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int i = 0;
        int j = 0;
        
        while (i < 1000000) {
            while (j < steps) {
                double random = Math.random();
                if (random >= 0.5) {
                    if (random >= 0.75) x++;
                    else x--;
                }
                else {
                    if (random >= 0.25) y++;
                    else y--;
                }
                j++;
            }
            i++;
        }
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance = " + distance);
        System.out.println("Sqaure root of steps = " + Math.sqrt(steps));
    }
}