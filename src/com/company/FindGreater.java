package com.company;

import java.util.Arrays;

public class FindGreater {


    public static int solve(int[] A){
        Arrays.sort(A);
        int n = A.length;
        int ans = -1;
        for(int i =0; i<n ; i++){
            int count =0;
            for(int j= i+1; j<n; j++){
                if(A[i]<A[j]){
                    count ++;
                }
            }

            if(count == A[i]){
                ans = 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
      int[] A = {1,2,3,3,4,5};
        System.out.println(solve(A));
    }
}
