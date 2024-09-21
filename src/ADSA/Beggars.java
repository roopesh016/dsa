package ADSA;

import java.util.ArrayList;

public class Beggars {

    public static int[] solve(int A, int[][] B) {

        //First insert the specified values with in the indexed positions
        int[] arr = new int[A];
        int n = B.length;
        for(int i=0;i<n;i++){
           int s = B[i][0]-1;
           int end = B[i][1]-1;
           int value = B[i][2];
           arr[s]+=value;
           if(end+1<arr.length){
               arr[end+1]-=value;
           }
        }

//        int sum =0;
        for(int k = 1; k<arr.length ;k++){
           arr[k]+=arr[k-1];
        }
       return arr;
    }



    public static void main(String[] args) {
        int A = 5;
        int[][] B = new int[3][3];
        B[0][0] = 1;
        B[0][1] = 2;
        B[0][2] = 10;
        B[1][0] = 2;
        B[1][1] = 3;
        B[1][2] = 20;
        B[2][0] = 2;
        B[2][1] = 5;
        B[2][2] = 25;

        solve(A,B);
    }
}
