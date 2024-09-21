package ADSA.sorting;

public class MergeTwoSortedArrays {


    public static int[] mergeTwoSortedArrays(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
       int[] C = new int[N+M];
       int index =0;
       for(int i =0; i<N; i++){
           C[index] = A[i];
           index++;
       }

        for(int j =0; j<M; j++){
            C[index] = B[j];
            index++;
        }

        int[] ans = new int[C.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<C.length; i++){
            min = Math.min(C[i],min);
            max = Math.max(C[i],max);
        }

        int[] frq = new int[max-min+1];

        for(int i=0; i<C.length; i++){
            int value = C[i];
            frq[value-min]++;
        }

        int index1 =0;

        for(int i=min; i<=max; i++){
            int count = frq[i-min];
            for(int j=1; j<=count; j++){
                ans[index1] = i;
                index1++;
            }
        }
        return ans;
    }


    public static int[] diferentLogic(int[] A, int[] B){
        int N = A.length;
        int M = B.length;
        int[] C = new int[N+M];
        int p1= 0;
        int p2 =0;
        int k=0;
        while(p1<N && p2<M){
            if(A[p1]<B[p2]){
                C[k] = A[p1];
                k++;
                p1++;
            } else {
                C[k] = A[p2];
                k++;
                p2++;
            }
        }

        while(p1<N){
            C[k] = A[p1];
            k++;
            p1++;
        }

        while(p2<M){
            C[k] = B[p2];
            p2++;
            k++;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A ={7,10, 11, 14};
        int[] B={3,8,9};
        int[] C =mergeTwoSortedArrays(A,B);

        for(int i =0; i<C.length; i++){
            System.out.println(C[i]);
        }
    }
}
