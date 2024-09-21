package ADSA;

public class SearchRowAndColumnWise {
    //search in row and column wise sorted matrix

    public static int solve(int[][] A, int B) {

        int i=0;
        int j = A[0].length-1;
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        while(i<n && j>=0){
            if(A[i][j]>B) {
                j--;
            }
            else if(A[i][j]<B) {
                i++;
            }
            else if(A[i][j]==B){
                int x = (i+1)* 1009 +(j+1);
                ans = Math.min(ans,x);
                j--;
            }
        }

        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] A =new int[3][3];
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        A[1][0] = 4;
        A[1][1] = 5;
        A[1][2] = 6;
        A[2][0] = 7;
        A[2][1] = 8;
        A[2][2] = 9;
        int B = 2;

        System.out.println(solve(A,B));
    }

}
