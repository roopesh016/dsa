package com.company;

public class ContributionTechnique {

    public static long subarraySum(int[] A) {
      int n = A.length;
      long ans = 0;
      for(int i=0; i<n; i++){
          int st = i+1;
          int end = n-i;
          int contribution = st*end;
          int eachElementContribution = contribution*A[i];
          ans+=eachElementContribution;
      }
      return ans;
    }

    public static void main(String[] args) {
        int A[] = {2,9,5};
        System.out.println(subarraySum(A));
    }
}
