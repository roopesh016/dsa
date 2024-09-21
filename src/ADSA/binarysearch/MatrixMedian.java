package ADSA.binarysearch;

public class MatrixMedian {

    public static int findMedian(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int l = 1;
        int r = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            l = Math.min(l , A[i][0]);
            r = Math.max(r , A[i][m-1]);
        }
        while (l<=r) {
            int mid = (l+r)/2;
            int count = 0;
            for (int i=0; i<n; i++) {
                count += findingelementslessthanmid(A,i,mid); //find elements less than mid
            }
            if (count<=(n*m)/2) { // if less elements to the left of the middle element
                l = mid + 1;
            }
            else {                //if more elements to the left of middle element
                r = mid - 1;
            }
        }
        return l;
    }

    public static int findingelementslessthanmid(int A[][], int i, int mid) { //check function
        int l = 0;
        int r = A[0].length-1;
        while (l<=r) {
            int m = (l+r)/2;
            if (A[i][m]<=mid) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        A[0][0] = 1;
        A[0][1] = 3;
        A[0][2] = 5;
        A[1][0] = 2;
        A[1][1] = 6;
        A[1][2] = 9;
        A[2][0] = 3;
        A[2][1] = 6;
        A[2][2] = 9;

        System.out.println(findMedian(A));
    }


}
