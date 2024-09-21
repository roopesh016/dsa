package com.company;

public class AntiDiagonal {
    public static int[][] diagonal(int[][] A) {
       int n = A.length;
       int m = A[0].length;
       int twoDArrayRowLength = 2*n-1;
       int[][] returnArray = new int[twoDArrayRowLength][m];
       int row = 0;
       for(int j=0;j<m;j++){
           int r =0;
           int c =j;

           while(r<n && c>=0){
               System.out.print(A[r][c]);
               returnArray[row][r] = A[r][c];
               r++;
               c--;

           }
           row++;
           System.out.println();
       }


       for(int i=1; i<n; i++){
           int r = i;
           int c = m-1;
           while(r<n && c>=0){
               System.out.print(A[r] [c]);
               returnArray[row][n-c-1] = A[r][c];
               r++;
               c--;
           }
           row++;
           System.out.println();
       }

       return returnArray;
    }




    public static void main(String[] args) {
        int[][] A = new int[3][3];
        A[0][0]=1;
        A[0][1]=2;
        A[0][2]=3;
        A[1][0]=4;
        A[1][1]=5;
        A[1][2]=6;
        A[2][0]=7;
        A[2][1]=8;
        A[2][2]=9;

        int[][] x=diagonal(A);
        for(int i=0;i<x.length; i++){
            for (int j =0; j<x[0].length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
