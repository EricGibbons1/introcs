// this was confusing -- did they just want one solution? Or do they want me to draw out all shitload of the solutions?
public class WebEx2_3_21
{
    public static int randomCol(int N, int i, boolean[] randomRow, boolean[][] board)
    {
        int random = (int) (Math.random() * N);
        if (randomRow[random] == false)
        {
            if(diagonal(N, i, random, board))
            {
                randomRow[random] = true;
                return random;
            }
            return randomCol(N, i, randomRow, board);
        }
        return randomCol(N, i, randomRow, board);
    }
    
    public static boolean diagonal(int N, int i, int random, boolean[][] board)
    {
        for(int j = 0; j < N; j++)
        {
            for(int k = 0; k < N; k++)
            {
                if (board[j][k] == true)
                {
                    if(Math.abs(i-j) == Math.abs(k-random)) return false;
                }
            }
        }
        return true;
    }
                
            
    
    public static void main(String[] args)
    {
        int N = 8;
        boolean[][] board = new boolean[N][N];
        boolean[] randomRow = new boolean[N];
        for (int i = 0; i < N; i++)
        {
            int t = randomCol(N, i, randomRow, board);
            board[i][t] = true;
        }
        
        for (int j = 0; j < N; j++)
        {
            for (int k = 0; k < N; k++)
            {
                if (board[j][k] == true) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}

        
        