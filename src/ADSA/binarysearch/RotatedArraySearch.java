package ADSA.binarysearch;

public class RotatedArraySearch {

    public static int search(final int[] A, int B) {
        int N = A.length;
        int low = 0;
        int high = N-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(A[mid]==B){
                return mid;
            }
            else if(A[low]<=A[mid]){
                 if(A[low]<=B && B<A[mid]){
                     high = mid-1;
                 }else {
                     low = mid+1;
                 }
            }else{
                if(B<=A[high] && A[mid]<B){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {9, 10, 3, 5, 6, 8};
        int B = 5;
        System.out.println(search(A,B));
    }
}
