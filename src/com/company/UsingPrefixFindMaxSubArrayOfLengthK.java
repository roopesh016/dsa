package com.company;

public class UsingPrefixFindMaxSubArrayOfLengthK {


    public static int maxSum(int A[], int K){
        int n = A.length;
        int[] prefixArray = new int[n];
        int ans = 0;
        //Find the prefix sum array
        for(int i=0;i<n ; i++){
            if(i==0){
                prefixArray[i]=A[i];
            } else {
                prefixArray[i] = prefixArray[i-1]+A[i];
            }
         }

        //Find the maxSubArray of length K
        int end = K-1;
        int sum =0;
        for(int i=0;i<n;i++){
            int start =i;
            while (end<n){
                if(i==0){
                    sum = prefixArray[end];
                } else {
                    sum = prefixArray[end]-prefixArray[start-1];
                }
                end++;
                break;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A={-3,4,-2,5,3,-2,8,2,-1,4};
        int K = 5;
        System.out.println(maxSum(A,K));
    }
}
