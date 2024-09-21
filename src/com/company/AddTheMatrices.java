package com.company;

public class AddTheMatrices {


    public static void check(int[][] A, int[][] B){
        int n = A.length;
        int[][] sumArray = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sumArray[i][j] = A[i][j]+B[i][j];
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumArray[i][j]);
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args) {

        int[][] A = new int[2][2];
        A[0][0]=3;
        A[0][1]=8;
        A[1][0]=4;
        A[1][1]=6;

        int[][] B = new int[3][3];
        B[0][0]=4;
        B[0][1]=0;
        B[1][0]=1;
        B[1][1]=-9;

        check(A,B);
    }


//    [[6],[2],[3],[10],[1],[3]]
//    [[6],[7],[3],[8],[1],[2]]
}
