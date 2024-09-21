package com.company;

public class Equillibrium {

   public static int fetchLhsRhsCount(int[] a){
       int count =0;
       for(int i=0;i<a.length; i++){
         int lSum=0;
         for(int j=0; j<=i-1; j++){
             if(j>0) {
                 lSum += a[j];
             }
         }
         int rSum=0;
         for(int r=i+1; r<=a.length-1; r++){
             rSum =+a[r];
         }
         if(lSum == rSum){
             count++;
         }
       }
       return count;
   }


    public static int solve(int[] A) {
        int ans =-1;
        long[] prefixSum = new long[A.length];
        prefixSum[0]=A[0];

        for(int i=1;i<=A.length-1;i++) {
            prefixSum[i]=prefixSum[i-1]+A[i];
        }

        for(int i=0;i<=prefixSum.length-1;i++) {

            long lSum =0;
            if(i==0){
                lSum =0;
            } else {
                lSum +=prefixSum[i-1];
            }

            long rSum =0;
            rSum +=prefixSum[prefixSum.length-1]-prefixSum[i];

            if(lSum==rSum){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] a ={-7, 1, 5, 2, -4, 3, 0};
        int[] a ={1,2,3,7,1,2,3};

//        System.out.println(fetchLhsRhsCount(a));
        System.out.println(solve(a));
    }
}
