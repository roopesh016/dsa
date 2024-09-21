package com.company;

public class ReverseString {

    public static void main(String[] args) {
        String str = "123";
        String ne = "";
        char[] s1 = str.toCharArray();

       for(int i=s1.length-1; i>=0; i--){
           ne += s1[i];
       }

        System.out.println(ne);
    }
}
