package com.company;

public class MultiplicationOfMatrices {


    public static void check(int[][] A, int B){
        int n = A.length;
        int m = A[0].length;
        int[][] x = new int[n][m];
        for(int i=0; i<n ; i++){
            for(int j=0; j<m;j++){
                x[i][j] = A[i][j]*B;
            }
        }

        //Print the multiplaction array
        for(int i=0; i<n ; i++){
            for(int j=0; j<m;j++){
                System.out.println(x[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = new int[2][2];
        A[0][0]=3;
        A[0][1]=8;
        A[1][0]=4;
        A[1][1]=6;

        int B =2;

        check(A,B);
    }
}
