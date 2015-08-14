// Music shuffling. You set your music player to shuffle mode. It plays each of the N songs before repeating any.
// Write a program to estimate the likelihood that you will not hear any sequential pair of songs
// (that is, song 3 does not follow song 2, song 10 does not follow song 9, and so on).

public class BookEx1_4_24 {
    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        int[] songs = new int[N];
        int follow = 0;
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) songs[i] = i;
            for (int i = 0; i < N; i++) {
                int r = i + (int) (Math.random() * (N - i));
                int temp = songs[r];
                songs[r] = songs[i];
                songs[i] = temp;
            }
            boolean repeat = false;
            for (int i = 1; i < N; i++) {
                if (songs[i] - 1 == songs[i-1]) repeat = repeat || true;
            }
            if (repeat == true) follow += 1;
        }
        System.out.println("Chance there was a sequential song = " + ((int) (follow*100/T)) + "%");
    }
}
            
                               
                               