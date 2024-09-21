package com.company;

public class PrefixArrayOne {



        public static long[] rangeSum(int[] A, int[][] B) {

            long [] prefixSum = new long[A.length];


            for(int i=0;i<=A.length-1;i++){
                if(i==0){
                    prefixSum[i]=A[i];
                } else{
                    prefixSum[i] = prefixSum[i-1]+A[i];
                }
            }



            long[] l = new long[B.length];

            for(int q=0; q<=B.length-1 ; q++){
                int L= B[q][0];
                int R= B[q][1];
                long sum=0;
                if(L==0){
                    sum+=prefixSum[R];
                } else {
                    sum+=prefixSum[R]-prefixSum[L-1];
                }
                l[q]=sum;
            }
            return l;
        }


    public static void main(String[] args) {
        int arr[] = {7,3,1,5,5,5,1,2,4,5};
        int [][] B = new int[4][2];
        B[0][0] = 6;
        B[0][1] = 9;
        B[1][0] = 2;
        B[1][1] = 9;
        B[2][0] = 2;
        B[2][1] = 4;
        B[3][0] = 0;
        B[3][1] = 9;
        long[] x= rangeSum(arr,B);
        for(int i=0; i<=x.length-1;i++){
            System.out.println(x[i]);
        }
    }
}
