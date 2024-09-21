package com.company;

public class PalindromOfString {

    public static boolean fetchStringIsPalindrom(String s){
       int i=0;
       int end = s.length()-1;

       while(i<end){
           if(s.charAt(i)!=s.charAt(end))
               return false;
           i++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {
        String A = "aba";
        System.out.println(fetchStringIsPalindrom(A));
    }
}
