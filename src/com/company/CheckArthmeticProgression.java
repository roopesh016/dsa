package com.company;

import java.util.Arrays;

public class CheckArthmeticProgression {

    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        if(n==2||n==1){
            return 1;
        }
        else {
            int diff = A[1]-A[0];
            for(int i=2; i<n;i++){
                if(A[i]-A[i-1] != diff)
                 return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
//        int[] A = {-251,-305,-323,-53,-215,-143,-107,-161,-179,-431,-449,-17,-341,-413,-35,-125,-197,-377,-269,-71,-359,-89,-233,-287,-395};
//        int[] A = {-87,-28,-20,37,-59,47,-75,-55,28,-9,-20,16,-56,-95,98,32,35,-97,96,74};
        int[] A ={24,44,-85,-65};
//        int[] A = {97,-53};
//        int[] A = {3,5,1};
        System.out.println(solve(A));
    }
}
