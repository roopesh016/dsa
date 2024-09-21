package com.company;

public class TransposeMatrix {

    public static void transposeMatrix(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int[][] twoDArray = new int[m][n];
        for(int i =0;i<m; i++){
            for(int j=0; j<n; j++){
                twoDArray[i][j] = A[j][i];
            }
        }

        for(int i =0;i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] A = new int[3][3];
//        A[0][0]=1;
//        A[0][1]=2;
//        A[1][0]=1;
//        A[1][1]=2;
//        A[2][0]=1;
//        A[2][1]=2;


        A[0][0]=1;
        A[0][1]=2;
        A[0][2]=3;
        A[1][0]=4;
        A[1][1]=5;
        A[1][2]=6;
        A[2][0]=7;
        A[2][1]=8;
        A[2][2]=9;

        transposeMatrix(A);
    }
}
