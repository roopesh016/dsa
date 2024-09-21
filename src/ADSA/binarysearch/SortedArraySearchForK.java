package ADSA.binarysearch;

public class SortedArraySearchForK {

    public static boolean check(int[] A, int k){
        int N = A.length;
        int lo = 0;
        int hi = N-1;
        int mid = (lo+hi)/2;
        boolean ans = false;
        while(lo<N && hi<N){
            if(A[mid]<k) {
                lo = mid+1;
                mid = (lo+hi)/2;
            }
            else if(A[mid]>k) {
                hi = mid-1;
                mid = (lo+hi)/2;
            }
            else if(A[mid]==k){
                ans = true;
                break;
            }
        }
        if(lo>N){
            ans = false;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3,6,9,12,14,19,20,23,25,27};
//        int K = 30;
        int K = 12;
        System.out.println(check(A,K));
    }
}
