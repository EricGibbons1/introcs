// Write a code fragment that reverses the order of a one-dimensional array a[] of double values.
 // Do not create another array to hold the result. Hint: Use the code in the text for exchanging two elements.

public class BookEx1_4_4 {
    public static void main (String[] args) {
        int[] array = new int[10];
        // initialize array
        for (int i = 0; i < array.length; i++) array[i] = i;
        for (int i = 0; i < (array.length/2); i++) {
            int r = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = r;
        }
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}
                
            