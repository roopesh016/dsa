package com.company;

public class MinSwaps {

    public static int solve(int[] A, int B){
          int n = A.length;
          int count =0;
          int ans =0;
          for(int i=0;i<n; i++){
              if(A[i]<=B){
                  count++;
              }
          }

          if(count<=1){
              return ans;
          }else {
              int l=0;
              int r=0;
              int x=0; //number of bad numbers
              while(r<count){
                  if(A[r]>B){
                      x++;
                  }
                  r++;
              }
              ans = x; //answer is initialised to number of bad numbers as we require 3 swaps
              while(r<n){
                  if(A[r]>B){
                      x++;
                  }
                  if(A[l]>B){
                      x--;
                  }
                  ans = Math.min(ans,x);
                   r++;
                   l++;
              }
              return ans;
          }
    }






    public static void main(String[] args) {
        int[] A ={1,12,10,3,14,10,5};
        int B=8;
        System.out.println(solve(A,B));
    }
}
