// Write a program GamblerPlot.java that traces a gambler's ruin simulation by
// printing a line after each bet that has one asterisk corresponding to each
// dollar held by the gambler.

public class BookEx1_3_22 { 

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);    // gambler's starting bankroll
        int goal  = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int T     = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat T times
        for (int t = 0; t < T; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            for (cash = cash; cash > 0 && cash < goal;) {
                bets++;
                for (int i = 1; i <= cash; i++) {
                    System.out.print("*");
                }
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;
                System.out.println();
                }
            if (cash == goal) {
                wins++;
                for (int i = 1; i <= cash; i++) {
                    System.out.print("*");
                }
            }
             for (int i = 0; i < 4; i++) {
                System.out.println("");
             }
        }

        // print results
        System.out.println(wins + " wins of " + T);
        System.out.println("Percent of games won = " + 100.0 * wins / T);
        System.out.println("Avg # bets           = " + 1.0 * bets / T);
    }
}