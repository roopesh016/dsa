package com.company;

public class ShiftAllZerosToR {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arrB[] = new int[arr.length];
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arrB[count++] = arr[i];
            }
        }

        for(int i=0;i<=arrB.length-1; i++){
            System.out.println(arrB[i]);
        }
    }
}
