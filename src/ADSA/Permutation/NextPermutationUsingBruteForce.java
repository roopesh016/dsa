package ADSA.Permutation;

public class NextPermutationUsingBruteForce {


    public static void swap(int[] A , int one, int end){
        int temp = A[one];
        A[one] = A[end];
        A[end] = temp;
    }

    public static void checkNextPermutation(int[] A, int fixIndx){
        int n = A.length;

        if(fixIndx == n-1){
            for(int i=0;i<n; i++){
                System.out.print(A[i]+" ");
            }
            System.out.println();
        }


        for(int i = fixIndx ; i < n; i++){
            swap(A,fixIndx,i);
            checkNextPermutation(A,fixIndx+1);
            swap(A,fixIndx,i);
        }
    }



    public static void main(String[] args) {
        int[] A = {0,1,2,5,3,3,0};
        checkNextPermutation(A,0);
    }
}
