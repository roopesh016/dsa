package ADSA.binarysearch;

public class FindPeakElement {


    public  static int solve(int[] A) {
        int N = A.length;

        int low =0;
        int hi = N-1;

        if(N==1){
            return A[0];
        }


        if(A[0]>A[1]) {
            return A[0];
        }


        if(A[N-1]>=A[N-2]) {
            return A[N-1];
        }


        while(low<=hi){
            int mid = (low+hi)/2;

            if((A[mid]>A[mid+1])&&(A[mid]>A[mid-1])){
                return A[mid];
            }


            else if((A[mid]>=A[mid-1] && (A[mid]<=A[mid+1]))){
                low = mid+1;
            }

            else {
                hi = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 1000000000,1000000000};
        System.out.println(solve(A));
    }
}
