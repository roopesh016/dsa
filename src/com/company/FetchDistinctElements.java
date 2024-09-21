package com.company;

import java.util.HashSet;

public class FetchDistinctElements {

    public static void fetchDistinctElements(int[] arr){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<Integer>();
          for(int i=0; i<n; i++){
              hs.add(arr[i]);
          }
        System.out.println(hs.size());
    }

    public static void main(String[] args) {
        int[] arr ={3,5,6,5,4};
        fetchDistinctElements(arr);
    }
}
