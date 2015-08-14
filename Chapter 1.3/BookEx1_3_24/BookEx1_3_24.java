// Modify Gambler.java to take an extra command line parameter that specifies the
// number of bets the gambler is willing to make, so that there are three possible
// ways for the game to end: the gambler wins, loses, or runs out of time. Add to
// the output to give the expected amount of money the gambler will have when the
// game ends.

public class BookEx1_3_24 { 

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);    // gambler's starting bankroll
        int goal  = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int T     = Integer.parseInt(args[2]);    // number of trials to perform
        int maxbets = Integer.parseInt(args[3]);  // max number of bets
        int gameover = 0;

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won
        int winnings = 0;    // total winnings

        // repeat T times
        for (int t = 0; t < T; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            for (;cash > 0 && cash < goal;) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;     // win $1
                    winnings++;
                }
                else                     {
                    cash--;     // lose $1
                    winnings--;
            }
            if (cash == goal) {
                wins++;
            }
            if (bets >= maxbets) {
                gameover++;
                break;
            }
        }

        // print results
        System.out.println(wins + " wins of " + T);
        System.out.println("Percent of games won = " + 100.0 * wins / T);
        System.out.println("Avg # bets           = " + 1.0 * bets / T);
        if (gameover > 0) System.out.println("Gambler is a pussy.");
        System.out.println("Total cash on hand = " + (winnings+stake));
    }
    }
}