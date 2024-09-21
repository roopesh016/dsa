package com.company;

public class ColumnSum {
    public  static int[] solve(int[][] A) {
        int n = A.length; //rows
        int m = A[0].length; //columns

        int[] ans = new int[m];
        int rowIndex = 0;
        for(int c=0;c<m;c++){
            int sum =0;
            for(int r=0;r<n;r++){
                sum += A[r][c];

            }
            ans[rowIndex] = sum;
            rowIndex++;
        }
       return  ans;
    }

    public static void main(String[] args) {
        int[][] A = new int[3][4];
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        A[0][3] = 4;
        A[1][0] = 5;
        A[1][1] = 6;
        A[1][2] = 7;
        A[1][3] = 8;
        A[2][0] = 9;
        A[2][1] = 2;
        A[2][2] = 3;
        A[2][3] = 4;

        solve(A);
    }
}
