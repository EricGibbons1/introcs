public class WebEx1_2_20 {
    public static void main (String[] args) {
        // My program
        int a = 1;
        int b = 6;
        double random1 = Math.random();
        double random2 = Math.random();
        int dice1 = (int) (a + random1 * (1 + b - a));
        int dice2 = (int) (a + random2 * (1 + b - a));
        int sum = dice1 + dice2;
        System.out.println(sum);
        
        // Book answer
        int sides = 6;
        int c = 1 + (int) (Math.random() * sides);
        int d = 1 + (int) (Math.random() * sides);
        int sum2 = c + d;
        System.out.println(sum2);
    }
}