package com.company;

public class FindMinimumNumberInArray {

    public int findMin(int[] B){
        int min = 10000000;
        for (int i=0;i<=B.length-1; i++){
            if(B[i]<=min) min=B[i];
        }
        return min;
    }

    public static void main(String[] args) {
        FindMinimumNumberInArray findMinArray = new FindMinimumNumberInArray();
        int a[] = {1,3,2,10,3,25,27,22,10,27,0};
        System.out.println("the maximum number in a given array:  "+findMinArray.findMin(a));
    }


}
