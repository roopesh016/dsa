package com.company;

public class AmazingSubArrays {

    public static int fetchAmazingSubArrays(String s1){
        int n = s1.length();
        int count =0;
        for(int i=0; i<n;i++){
                    char c = s1.charAt(i);
                    if("aeiouAEIOU".indexOf(c)!=-1){
                       count = (count+(n-i)%10003)%10003;
                    }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fetchAmazingSubArrays("ABEC"));

    }
}
