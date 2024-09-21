package com.company;

public class ReverseEntireString {


    public static String reverse(String A){
        String s1 ="";
        String[] s2 = A.split(" ");
        int n = s2.length;
        for(int i=n-1; i>=0; i--){
           s1+=s2[i]+" ";
        }
        return s1.trim();
    }

    public static void main(String[] args) {
        String A = "the sky is blue";
        System.out.println(reverse(A));
    }
}
