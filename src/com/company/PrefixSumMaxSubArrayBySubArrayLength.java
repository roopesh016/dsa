package com.company;

public class PrefixSumMaxSubArrayBySubArrayLength {


    public static void main(String[] args) {
        int[] A ={-3,4,-2,5,3,-2,8,2,-1,4};

        int k =4;
        int st=0;
        int end = k;
        int sum=0;
        int max = Integer.MIN_VALUE;

        int[] prefixSum = new int[A.length];

        prefixSum[0]=A[0];
        for(int i=1; i<A.length ; i++){
            prefixSum[i] = prefixSum[i-1]+A[i];
        }

        while (end<prefixSum.length) {
            if (st == 0) {
                sum = prefixSum[end];
            } else {
               sum = prefixSum[end] - prefixSum[st-1];
            }
            if(sum > max){
                max = sum;
            }
            st++;
            end++;
        }
        System.out.println(max);
    }
}
