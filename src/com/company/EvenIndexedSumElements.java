package com.company;

public class EvenIndexedSumElements {


    public static void check(int arr[], int q[][]) {

        for (int i = 1; i <= arr.length - 1; i++) {
            if(i%2==0){
                arr[i] = arr[i - 1] + arr[i];
            } else {
               arr[i]=arr[i-1];
            }
        }

        //{2,4,3,7,9,8,6,3,4,9}
        //{2,2,5,5, 14, 14,20,20 ,24,24}
        // 0,1,2,3,  4, 5,  6, 7 ,8, 9

        for (int i = 0; i <= q.length - 1; i++) {
            int L = q[i][0];
            int R = q[i][1];
            int sum = 0;
            if (L == 0) {
                sum += arr[R];
                System.out.println(sum);
            } else {
                sum +=arr[R]-arr[L-1];
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,3,7,9,8,6,3,4,9};
        int[][] sE = new int[5][2];
        sE[0][0] = 4;
        sE[0][1] = 8;
        sE[1][0] = 3;
        sE[1][1] = 9;
        sE[2][0] = 1;
        sE[2][1] = 3;
        sE[3][0] = 0;
        sE[3][1] = 4;
        sE[4][0] = 7;
        sE[4][1] = 7;
        check(arr,sE);
    }



}
