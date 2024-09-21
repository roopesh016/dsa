package com.company;

public class Array {
//    [1,10,11,31,4,4,6]
//            [1,10,11,31,31,4,6]

    public static void main(String[] args) {
        int count =0;
        int[] a ={1,10,11,31,4,4,6};
        int max = -1000000;
        for(int i=0; i<=a.length-1; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }

        for(int i=0;i<=a.length-1;i++){
            if(max!=a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
