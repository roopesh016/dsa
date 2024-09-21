package ADSA.binarysearch;

public class SortedArrayElementFindFirstIndex {


    //SortedArray Find first index of the given target

    public static int firstIndex(int[] A, int K){
        int N = A.length;
        int low = 0 ;
        int hi = N-1;
        int ans = -1;
        while(low<=hi){
            int mid = (low+hi)/2;

            if(A[mid]>K){
                hi = mid-1;
            }else if(A[mid]<K){
                low = mid+1;
            }else if(A[mid]==K){
                ans = mid;
                hi = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,10,15,16};
        int K = 5;
        System.out.println(firstIndex(A,K));
    }
}
