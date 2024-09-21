package com.company;

public class SubArraySumLessThanB {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int count =0;


        for(int i=0;i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum +=A[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }


    public static int solveTwo(int[] A, int B) {
        int n = A.length;
        int count =0;

        int sum =0;
        for(int i=0;i<n; i++){
                sum +=A[i];
                if(sum<B){
                    count++;
                }

        }
        return count;
    }

    public static int solveThree(int[] A, int B) {

        int n = A.length;
        int count =0;

        int sum =0;
        int[] prefixSum = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                prefixSum[i]=A[i];
            }else {
                prefixSum[i] = prefixSum[i-1]+A[i];
            }
        }

        for(int i =0;i<n; i++){
            if(i==0){
                sum = prefixSum[i];
            }else{
                sum = prefixSum[i]-prefixSum[i-1];
            }

            if(sum<B){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
//        int[] A ={3,12,11,11,11,15};
        int[] A ={2, 5, 6};
        int B=10;
        System.out.println(solveThree(A,B));
    }
}
