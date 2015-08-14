// Modify SelfAvoidingWalk.java to calculate and print the average length of the paths as well as the dead-end probability.
// Keep separate the average lengths of escape paths and dead-end paths.


public class BookEx1_4_18 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);       // lattice size
        int T = Integer.parseInt(args[1]);       // number of trials
        int deadEnds = 0;                        // trials resulting in a dead end
        int deadEndLength = 0;
        int escapeLength = 0;

        // simulate T self-avoiding walks
        for (int t = 0; t < T; t++) {
            boolean[][] a = new boolean[N][N];   // intersections visited 
            int x = N/2, y = N/2;                // current position
            int Length = 0;

            // repeatedly take a random step, unless you've already escaped
            while (x > 0 && x < N-1 && y > 0 && y < N-1)  {

                // dead-end, so break out of loop
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) {
                    deadEnds++;
                    deadEndLength += Length;
                    escapeLength -= Length;
                    break;
                } 

                // mark (x, y) as visited
                a[x][y] = true;

                // take a random step to unvisited neighbor
                double r = Math.random(); 
                if      (r < 0.25) { if (!a[x+1][y]) {
                    x++;
                    Length++;
                    escapeLength++;
                }
                }
                else if (r < 0.50) { if (!a[x-1][y]) {
                    x--;
                    Length++;
                    escapeLength++;
                }
                }
                else if (r < 0.75) { if (!a[x][y+1]) {
                    y++;
                    Length++;
                    escapeLength++;                    
                }
                }
                else if (r < 1.00) { if (!a[x][y-1]) {
                    y--;
                    Length++;
                    escapeLength++;                    
                }
                }
            } 
        } 

        System.out.println(100*deadEnds/T + "% dead ends"); 
        System.out.println("Average escape length = " + escapeLength/(T-deadEnds));
        if (deadEnds != 0) System.out.println("Average dead end length = " + deadEndLength/deadEnds);
    } 
} 