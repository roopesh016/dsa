package com.company;

public class PrintAllSubArrays {

    public static int[][] solve(int[] A) {
        int n=A.length;
        int twoDArrayLength = n*(n+1)/2;
        int rowIndex =0;
        int [][] B = new int[twoDArrayLength][];
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++){
                int colIndex =0;
                int[] colArray = new int[j-i+1];
                for(int k=i;k<=j;k++) {
                    colArray[colIndex++]=A[k];
                }
                B[rowIndex++]=colArray;
            }
        }
        return B;
    }


    public static void main(String[] args) {
        int [] arr ={36,63,63,26,87,28,77,93,7};
        solve(arr);
    }
}
