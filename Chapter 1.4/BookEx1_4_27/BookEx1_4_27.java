// Rumors. Alice is throwing a party with N other guests, including Bob. Bob starts a rumor about Alice by telling it to one of the
// other guests. A person hearing this rumor for the first time will immediately tell it to one other guest, chosen at random from all
// the people at the party except Alice and the person from whom they heard it.
// If a person (including Bob) hears the rumor for a second time, he or she will not propagate it further.
// Write a program to estimate the probability that everyone at the party (except Alice) will hear the rumor before it stops propagating.
// Also calculate an estimate of the expected number of people to hear the rumor.

public class BookEx1_4_27 {
    public static void main (String[] args) {
        // N = party size
        int N = Integer.parseInt(args[0]);
        
        // all party starts out not hearing the rumor
        boolean[] party = new boolean[N];
        int countTotal = 0;
        int success = 0;
        
        for(int t = 0; t < 5; t++) {
            for (int i = 0; i < N; i++) {
                int r;
                int prev = 0;
                int count = 0;
                int current;
                party[0] = true;
                do {
                    r = (int) (Math.random() * N);
                } while (r == prev || r = current);
                current = r;
                if (party[r] == true) {
                    break;
                }
                else {
                    party[r] = true;
                    count++;
                    countTotal++;
                    current = prev;
                    prev = r;
                    if (count == (N-1)) {
                        success++;
                        break;
                    }
                }
            }
        }
        System.out.println("Probability everyone hears rumor = " + success);
        System.out.println("Average number of rumormongers = " + countTotal);
    }
}
            