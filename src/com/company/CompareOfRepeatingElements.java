package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompareOfRepeatingElements {

    public static ArrayList<Integer> check(ArrayList<Integer> A, ArrayList<Integer> B){
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int nA = A.size();
        int nB = B.size();
        for(int i=0; i<nA; i++){
            if(hMap.containsKey(A.get(i))){
                int frequencey = hMap.get(A.get(i));
                hMap.put(A.get(i),frequencey+1);
            } else{
                hMap.put(A.get(i),1);
            }
        }


    ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nB; i++){
            if(hMap.containsKey(B.get(i)) && hMap.get(B.get(i)) >=1  ){
                ans.add(B.get(i));
                int freq= hMap.get(B.get(i));
                hMap.put(B.get(i), freq-1);
            }
        }
    return ans;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> A =new ArrayList<>();
//        A.add(2);
//        A.add(1);
//        A.add(4);
//        A.add(10);
//        ArrayList<Integer> B =new ArrayList<>();
//        B.add(3);
//        B.add(6);
//        B.add(2);
//        B.add(10);
//        B.add(10);

        ArrayList<Integer> A =new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(1);
        ArrayList<Integer> B =new ArrayList<>();
        B.add(2);
        B.add(3);
        B.add(1);
        B.add(2);


        ArrayList<Integer> x = check(A,B);
        for(int i=0;i<x.size();i++){
            System.out.println(x.get(i));
        }
        // [2, 10]

        //[1, 2, 2, 1]
        //[2, 3, 1, 2]
        //[1, 2, 2]
    }
}
