package com.company;

import java.util.Arrays;

public class FindMinimumCost {


    public static int elementsRemoval(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int i =0;
        int j =n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        int sum =0;
        for(int k=0; k <n; k++){
            sum = sum+arr[i]*(i+1);
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1};
        System.out.println(elementsRemoval(arr));
    }
}
