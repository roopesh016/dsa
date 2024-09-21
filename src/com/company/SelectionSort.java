package com.company;

public class SelectionSort {
    //We look for minimum index and keep swapping
    //5 -> we will take minindex
    //second loop -> we keep iterating from i+1 and check if array[i+1/j]<array[minindex]
    //update the minindex = i+1;
    //once it goes till the entire iteration we will just swap the index values

    public static int[] solve(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] =temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={5,4,3,6,2};
        int[] expectedArray = solve(arr);
        for(int i=0; i<expectedArray.length; i++){
            System.out.println(expectedArray[i]);
        }
    }
}
