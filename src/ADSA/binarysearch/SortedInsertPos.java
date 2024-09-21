package ADSA.binarysearch;

public class SortedInsertPos {

    public static int searchInsert(int[] A, int B) {

        int N = A.length;
        int low =0;
        int hi = N-1;
        while(low<=hi){
            int mid = (low+hi)/2;

            if(A[mid]==B)
                return mid;
            else if(A[mid]>B)
                hi = mid-1;
            else
                low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
       int[]  A  ={1,4,9};

       int B = 3;

       System.out.println(searchInsert(A,B));
    }
}
