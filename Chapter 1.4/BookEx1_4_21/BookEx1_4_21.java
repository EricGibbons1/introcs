// Longest plateau. Given an array of integers, find the length and location of the longest contiguous sequence of equal values where the
// values of the elements just before and just after this sequence are smaller.

public class BookEx1_4_21 {
    public static void main (String[] args) {
        int[] array = {1,2,3,4,4,4,4,5,5,4,4,4,4,2,3,3,2,3,3,3,3,3,3,3,3,3,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1};
        int start = 0;
        int end = 0;
        int plat = 0;
        int start2 = 0;
        int end2 = 0;
        int plat2 = 0;
        for (int i = 1; i < (array.length - 1); i++) {
            if (plat < 1) {
                if (array[i] > array[i-1] && array[i] == array[i+1]) start = i;
                if (array[i] > array[i+1] && array[i] == array[i-1]) end = i;
                if (start != 0 && end != 0) plat = 1 + end - start;
            }
            else {
                if (array[i] > array[i-1] && array[i] == array[i+1]) start2 = i;
                if (array[i] > array[i+1] && array[i] == array[i-1]) end2 = i;
                if (start2 != 0 && end2 != 0) plat2 = 1 + end2 - start2;
                if (plat2 > plat) {
                    plat = plat2;
                    end = end2;
                    start = start2;
                }
            }
        }
        System.out.print("Start point = " + start + ", end point = " + end + ", length = " + plat);
    }
}
                    
            
        