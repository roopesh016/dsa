package ADSA.binarysearch;

public class MatrixSearch {

    public static int searchMatrix(int[][] A, int B) {

        int ans =0;
        int N = A.length;
        int M = A[0].length;
        int low =0;
        int high = M*N-1;


        while(low<=high){
            int mid = (low+high)/2;

            int row = mid / M;
            int col = mid % N;

            if(A[row][col]==B)
                return 1;

            else if(A[row][col]>B)
                high = mid-1;

            else if(A[row][col]<B)
                low = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][]  X = new int[3][4];
        int B = 3;
        X[0][0] = 1;
        X[0][1] = 3;
        X[0][2] = 5;
        X[0][3] = 7;
        X[1][0] = 10;
        X[1][1] = 11;
        X[1][2] = 16;
        X[1][3] = 20;
        X[2][0] = 23;
        X[2][1] = 30;
        X[2][2] = 34;
        X[2][3] = 50;

        System.out.println(searchMatrix(X,B));
    }
}
