package com.company;

import java.util.Arrays;

public class SmallerElementCount {

    public static int check(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int count =0;
        int ans = 0;
        if(arr[0]==0){
            ans ++;
        }
        for(int i=1; i <n ; i++){
            if(arr[i]!=arr[i-1]){
                count =i;
            } else if(arr[i]==arr[i-1]){
                 //lesser count remain same
            }

            if(arr[i]==count){
                ans++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 3};
        System.out.println(check(arr));
    }
}
