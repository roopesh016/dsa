package com.company;

public class FindMaxSumSubArrays {


    //Find the maximum sum of sub arrays


    public static void maxSumSubArray(int[] A){
        int n = A.length;
        int rowIndex =0;
        int[][] subArrays = new int[n*(n+1)/2][];
        int overAllMax =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int colIndex =0;
                int[] colArray = new int[j-i+1];
                int sum = 0;
                for(int k=i;k<=j;k++){
                    colArray[colIndex++] = A[k];
                    sum +=A[k];
                }
                if(sum > overAllMax){
                    overAllMax = sum;
                }
                subArrays[rowIndex++]=colArray;
            }
        }
        System.out.println("The overAll Max:"+overAllMax);
    }


    public static void secondLogic(int n,int[] A){
        int[] prefixArray = new int[n];
        prefixArray[0] = A[0];
        for(int i =1;i<n;i++) {
            prefixArray[i] = prefixArray[i-1]+A[i];
        }

        int Max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n; j++){
                int sum =0;
                if(i==0) {
                    sum = prefixArray[j];
                }
                else{
                    sum = prefixArray[j] - prefixArray[i-1];
                }
                if(sum>Max){
                    Max = sum;
                }
            }
        }
        System.out.println("The max sum:"+Max);
    }


    public static int solveSecond(int n,int A[]){
        int ans =0;
        int Max = 1;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum+=A[j];
                if(sum<=Max){
                    ans = Math.max(sum,ans);
                }
                else {
                    break;
                }
            }
            
        }
       return ans;
    }


    public static int getSubArraySumUsingCarryForwardTechnique(int A[]){
        int overAllMax =0;
        int n = A.length;
        for(int i=0;i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++) {
                sum += A[j];
                if (sum > overAllMax) {
                    overAllMax = sum;
                }
            }
        }
        return overAllMax;
    }


    public static int kandensAlgorithm(int[] A){
        int n = A.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            sum+=A[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }



    public static void main(String[] args) {
//        int[] A={2, 2, 2};
        //{2,3,6,10,15}
//        int[] A ={-3,2,4,-1,3,-4,3};
        int[] A ={-2,-3,-1,-4};
//        int carryForward = getSubArraySumUsingCarryForwardTechnique(A);
//        System.out.println(carryForward);

        int ans = kandensAlgorithm(A);
        System.out.println(ans);
//        System.out.println(solveSecond(3,A));
    }
}
