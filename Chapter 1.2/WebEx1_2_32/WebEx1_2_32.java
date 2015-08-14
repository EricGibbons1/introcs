public class WebEx1_2_32 {
    public static void main (String[] args) {
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);
        double white = Math.max(red/255, Math.max(green/255,blue/255));
        double cyan = 0;
        double magenta = 0;
        double yellow = 0;
        double black = 0;
        if (red == 0 && green == 0 && blue == 0) {
            black = 1;
            System.out.println("cyan = " + cyan);
            System.out.println("magenta = " + magenta);
            System.out.println("yellow = " + yellow);
            System.out.println("black = " + black);
        } else if (!(red == 0 && green == 0 && blue ==0)) {
            cyan = (white - red/255)/white;
            magenta = (white - green/255)/white;
            yellow = (white - blue/255)/white;
            black = (1 - white);
            System.out.println("cyan = " + cyan);
            System.out.println("magenta = " + magenta);
            System.out.println("yellow = " + yellow);
            System.out.println("black = " + black);
        }
    }
}
