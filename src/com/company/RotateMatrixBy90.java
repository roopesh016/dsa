package com.company;

public class RotateMatrixBy90 {

    public static void rotateMatrix(int[][] A){

        int n = A.length;
        int m = A[0].length;
        //Transpose Matrix
        for(int i=0; i<m; i++){
            for(int j=i+1;j<n; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //Rotate Matrix By swaping
        for(int r=0; r<n; r++){
            int st = 0;
            int end = n-1;
            while (st<end){
                int temp = A[r][st];
                A[r][st] = A[r][end];
                A[r][end] = temp;
                st++;
                end --;
            }
        }

        //Print the rotate matrix
        for(int x=0;x<n;x++){
            for(int y=0;y<m; y++){
                System.out.print(A[x][y]);
            }
            System.out.println();
        }
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

        rotateMatrix(A);
    }
}
