package com.company;

public class MinimumTime {

    public static int solve(int[] A) {
         //find the max

        if(A.length==1){
            return 0;
        }

        int Max = -100000;
        for(int i=0;i<=A.length-1; i++) {
            if(A[i]>Max){
                Max = A[i];
            }
        }

        //increment all the values to the max value
        int[] X = new int[A.length-1];
        int count =0;
        for(int i=0;i<=A.length-1; i++){
            if(A[i]!=Max){
                X[count++] = Max-A[i];
            }
        }
        int totalTime =0;
        for(int i=0;i<=X.length-1; i++){
            totalTime +=X[i];
        }
        return  totalTime;
    }


    public static void main(String[] args) {
       int[] A={1};
        System.out.println(solve(A));
    }
}
