package ADSA.sorting;

public class ZerosOnLOnceOnR {


    public static int[] sortColors(int[] A) {
        int N = A.length;
       int[] ans = new int[N];
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;

       for(int i=0;i<N; i++){
           min = Math.min(A[i],min);
           max = Math.max(A[i],max);
       }

       int[] frq = new int[max- min + 1];
       for(int i=0; i<N; i++){
           int value = A[i];
           frq[value-min]++;
       }

       int index =0;
       for(int i=min; i<=max; i++){
           int count = frq[i-min];
           for(int j=1; j<=count; j++){
               ans[index] = i;
               index++;
           }
       }
       return ans;
    }

    public static void main(String[] args) {

        int[] A = {0,1,0,0,1,1,0,1,1};
        sortColors(A);
    }
}
