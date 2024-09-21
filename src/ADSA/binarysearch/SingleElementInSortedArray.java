package ADSA.binarysearch;

public class SingleElementInSortedArray {


    public static int solve(int[] A) {
        int N = A.length;
        if(A[0]!=A[0+1]){
            return A[0];
        }
        if(A[N-1]!=A[N-2]){
            return A[N-1];
        }

        int low = 0;
        int hi = N-1;

        while(low<=hi) {
            int mid = (low + hi) / 2;

            if((A[mid]!=A[mid+1]) && A[mid]!=A[mid-1])
                return A[mid];

            if ((mid % 2 == 0) && (A[mid] == A[mid + 1])||
                    (mid %2 ==1) && (A[mid] == A[mid-1])){
                hi = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
      int[]  A  = {1,1,2,2,3};
        System.out.println(solve(A));
    }
}
