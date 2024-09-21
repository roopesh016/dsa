package com.company;

public class ArrayWithEqualSum {


    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        int[] prefixSum = new int[n];
        for(int i=0; i<n; i++){
            if(i==0){
                prefixSum[i]=A[i];
            }else {
                prefixSum[i] = prefixSum[i-1]+A[i];
            }
        }

        int start = 0;
        int sum =0;
        int ans =0;
        int end = B-1;
        while(end<n){
            if(start==0){
                sum = prefixSum[end];
            } else {
                sum = prefixSum[end] - prefixSum[start-1];
            }

            if(sum == C){
                ans = 1;
                break;
            } else {
               ans =0;
            }
            end++;
            start++;

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1};
        int B = 4 ;
        int C =6;
        System.out.println(solve(A,B,C));
    }
}
