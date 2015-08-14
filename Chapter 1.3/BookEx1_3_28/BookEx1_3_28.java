// Write a program GCD.java that find the greatest common divisor (gcd) of two
// integers x and y using Euclid's algorithm, which is an iterative computation based
// on the following observation: If x > y, then if y divides into x, the gcd of x and y
// is y; otherwise the gcd of x and y is the same as the gcd of x % y and y.


public class BookEx1_3_28 {
  public static void main(String[] args){
    int x = Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));    
    int y = Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));     
    for (int r = x % y; r != 0; r = x % y){
      x = y;
      y = r;
    }
    System.out.println(y);
  }
}