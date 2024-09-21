package com.company;

import java.util.HashMap;

public class FirstOccuranceOfRepeatingElement {


    public static int solve(int[] A){
        int n = A.length;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0; i<n ; i++){
            int element = A[i];
            if(hashMap.containsKey(element)){
                int frequency = hashMap.get(element);
                hashMap.put(A[i],frequency+1);
            }else{
                hashMap.put(A[i],1);
            }
        }

        int ans =-1;
        for(int i=0; i<n; i++){
            if(hashMap.get(A[i])>=2) {
                ans = A[i];
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120};
        System.out.println(solve(arr));
    }
}
