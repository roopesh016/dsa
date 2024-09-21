package com.company;

public class FindMaximumNumberInArray {

    public int check(int[] a){
        int max1 = -10000000;
        for(int i=0; i<=a.length-1 ; i++){
            if(a[i]>=max1) max1=a[i];
        }
        return max1;
    }

    public static void main(String[] args) {
        FindMaximumNumberInArray findMaximumNumberInArray = new FindMaximumNumberInArray();
        int a[] = {1,3,2,10,3,25,27,22,10,27};
        System.out.println("the maximum number in a given array:  "+findMaximumNumberInArray.check(a));
    }
}
