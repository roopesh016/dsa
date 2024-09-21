package com.company;

import java.util.HashMap;

public class UsingHashMap {

    public static int[] check(int[] arr, int[] q){
        int n = arr.length;
        int n1 = q.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
      for(int i=0; i<n ; i++){
          int element = arr[i];
          if(hashMap.containsKey(element)){
              int frequency = hashMap.get(element);
              hashMap.put(arr[i],frequency+1);
          }else{
              hashMap.put(arr[i],1);
          }
      }

      for(int i=0; i<n1; i++){
          for(int k:hashMap.keySet()){
              if(k==q[i] && hashMap.containsKey(q[i])){
                  System.out.println("The frequency of the element based upon the query:"+k +":"+hashMap.get(q[i]));
              }
          }
      }


        int[] ans = new int[n1];
        int rowIndex =0;
        for(int i=0; i<n1; i++){
            if(hashMap.containsKey(q[i])) {
                ans[rowIndex++] = hashMap.get(q[i]);
            } else{
                ans[rowIndex++] = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int arr[] = {2,6,3,8,2,8,2,3,8,10,6};
        int arr[] = {7,6,6,3,1,5,7};
//        int q[] = {2,8,3,10};
        int q[] = {2,1,7,5,8};
        int[] expected = check(arr,q);
        for(int i=0; i<expected.length; i++){
            System.out.println(expected[i]);
        }
    }
}
