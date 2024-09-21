package com.company;

public class SmallestSubArray {

   //Return smallest sub array which has noth min and max values

    public static int solve(int[] A){

      int n = A.length;
        int ans =n;
      //find min value:
        int min = 100000;
        for(int i=0;i<n; i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        System.out.println("The min value:"+ min);
        int max = -100000;
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println("The max value:"+ max);

        if(min==max){
            ans = 1;
        }

        for(int i=0; i<n; i++) {

               if(A[i]==min) {
                   for(int j=i+1; j<n; j++){
                       if(A[j]==max){
                           ans = Math.min(ans,j-i+1);
                           break;
                       }
                   }
               }

               if(A[i]==max) {
                   for(int j=i+1; j<n; j++){
                       if(A[j]==min){
                           ans = Math.min(ans,j-i+1);
                           break;
                       }
                   }
               }

        }

        return ans;

    }


    public static void main(String[] args) {
        int A[] = {814,761,697,483,981};
        System.out.println(solve(A));
    }
}
