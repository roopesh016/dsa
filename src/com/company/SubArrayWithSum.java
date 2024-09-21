package com.company;

import java.util.ArrayList;

public class SubArrayWithSum {


    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i =0;
        int j =0;
        int n = A.size();
        int sum = A.get(0);
        while(j< n ){
            if(sum == B){
              for(int x =i; x<=j; x++){
                  ans.add(x);
              }
            }
            else if(sum > B){
                sum = sum - A.get(i);
                i++;
            } else{
                j++;
                if(j<n)
                    sum = sum+A.get(j);
            }
        }
        if(ans.size()!=0)
             ans.add(-1);

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(10);
        A.add(20);
        A.add(100);
        A.add(105);
        int B = 110;
        SubArrayWithSum subArrayWithSum = new SubArrayWithSum();

        System.out.println(subArrayWithSum.solve(A,B));
    }
}
