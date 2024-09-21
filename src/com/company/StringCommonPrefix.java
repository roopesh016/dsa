package com.company;

import java.util.Arrays;

public class StringCommonPrefix {


    public static void fetch(String[] a){
        Arrays.sort(a);

        int size = a.length;

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());

        System.out.println(end);

        int i = 0;

        while(i < end && a[0].charAt(i) == a[size-1].charAt(i) ){
            i++;
        }

        String s1 = a[0].substring(0, i);

        System.out.println(s1);
    }


    public static void main(String[] args) {
        String[] sJ = {"abcd", "abde", "abcf"};
       fetch(sJ);
    }
}
