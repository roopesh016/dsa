package ADSA;

public class SwapTwoNumbsWithoutUsingExtraVariable {

    public static int[]  check(int[] A){
        int i =0;
        int j = A.length-1;
        while(i<j){
            A[i] = A[i]+A[j];
            A[j] = A[i]-A[j];
            A[i] = A[i]-A[j];
            i++;
            j--;
        }
        return A;
    }



    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6};
        check(A);
    }
}
