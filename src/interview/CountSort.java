package interview;

public class CountSort {


    public static void countSort(int[] A){
        int n = A.length;
        int max = findMax(A);
        int[] count = new int[max+1];

        for(int i=0; i<n; i++){
            count[A[i]]++; // count[2]++ -> at 2nd index it inserts +1 as by default the array will be intialised as zero
        }


        int lastIndex = 0;
        for (int i = 0; i <= max; ++i) {
            while (count[i]-- > 0) {
                A[lastIndex++] = i;
            }
        }

    }


    public static int findMax(int[] A){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(A[i],max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] a = {2,3,1,1,3,4,7,7,4};
        countSort(a);
    }
}
