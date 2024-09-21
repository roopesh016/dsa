package com.company;

public class SlidingWindowTechnique {

    public static int maxSum(int[] A, int K){
        int max = 0;
        int sum = 0;
        int n = A.length;
        for(int i=0; i<=K-1;i++){
            sum+=A[i];
        }
        if(sum > max){
            max = sum;
        }

        int start = 1;
        int end = K;

        while(end<n){
            sum = sum-A[start-1]+A[end];
            if(sum > max){
                max = sum;
            }
            start++;
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A={-3,4,-2,5,3,-2,8,2,-1,4};
        int K = 5;
        System.out.println(maxSum(A,K));
    }
}
