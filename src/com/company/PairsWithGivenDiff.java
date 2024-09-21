package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairsWithGivenDiff {

    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;

        // count frequency of every element
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : A){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            }else{
                hm.put(i, 1);
            }
        }

        // storing only distinct element
        HashSet<Integer> hs = new HashSet<>();
        for(int i : A){
            if(!hs.contains(i)){
                hs.add(i);
            }
        }

        // Arraylist is store all the all the distict element from hashset, which we will use to iterate
        ArrayList<Integer> ans = new ArrayList<>(hs);

        /*Finding ans logic
         if B == 0, we will check if there are any two same elements or the count of same element is greater than 1. Eg - 1 1 1 1 2 2 2  and B is 0......... so count of 1 = 4 and count of 2 = 3; ans would be (1-1) and (2-2) only 2 paris.
ans in this case

*/
        for(int i : ans){
            if(B == 0){
                if(hm.get(i) > 1){
                    count++;
                }
            }else{
                if(hm.containsKey(B+i)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] A = {1,5,3,4,2};
//       int[] A = {1,1,1,2,2};
       int B = 3;
       PairsWithGivenDiff pairsWithGivenDiff = new PairsWithGivenDiff();
        System.out.println(pairsWithGivenDiff.solve(A,B));
    }
}
