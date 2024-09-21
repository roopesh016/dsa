package com.company;

public class Bob {


    public static int occurance(String A){
        int n = A.length();
        int count =0;
       for(int i=0; i<n-2; i++){
           char a = A.charAt(i);
           char b = A.charAt(i+1);
           char c= A.charAt(i+2);
           String result = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
           if("bob".equalsIgnoreCase(result)){
             count++;
           }
       }
       return count;
    }


    public static void main(String[] args) {
        System.out.println(occurance("abobc"));
    }
}
