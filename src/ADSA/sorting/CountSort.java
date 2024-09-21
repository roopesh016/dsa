package ADSA.sorting;

public class CountSort {


    public static int[] check(int[] A){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int N = A.length;
        for(int i=0; i<N ; i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }

        int[] frq = new int[max-min+1];
        for(int j=0; j<N;j++){
            int x = A[j];
            frq[x-min]++;
        }

        int[] ans = new int[N];
        int index =0;
        for(int k = min; k<=max; k++){
            int count = frq[k-min];
            for(int l=1 ; l<=count; l++){
                ans[index] = k;
                index++;
            }
        }
      return ans;
    }


    public static void main(String[] args) {
        int[] A = {9,10,8};
        check(A);
    }
}
