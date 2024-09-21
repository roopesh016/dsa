package com.company;

import java.util.Arrays;

public class SortArray {


//    Input:
//    N = 5
//    arr[]= {0 2 1 2 0}
//    Output:
//            0 0 1 2 2
//    Explanation:
//            0s 1s and 2s are segregated
//    into ascending order.

    public static void logicOne(){
        int arr[] = {0,2,1,2,0};
        Arrays.sort(arr);
        int brr[] = new int[arr.length];
        for(int i= 0; i<=arr.length-1;i++){
            brr[i]=arr[i];
            System.out.println(brr[i]);
        }
    }


    //    arr[]= {-2,0,11,-9,45}
    static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void quickSort(){

    }

    public static void mergeSort(){

    }



    public static void main(String[] args) {
//        logicOne();
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
       bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
