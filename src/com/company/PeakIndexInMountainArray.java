package com.company;

public class PeakIndexInMountainArray {
 //Elements in the array strictly increasing from and drastically decreasing down

    public static void main(String[] args) {
//       int arr[] = {0,10,5,2};
//       int arr[] = {4, 6, 9, 11, 45, 40, 20, 1};
//       int low = arr[0];
//       int high = arr.length-1;
//       int mid;
//       for(int i=1;i<=arr.length-1;i++){
//         mid = low+(high-low)/2;
//         if(arr[mid]>arr[mid+1]){
//             high =mid;
//         }else {
//             low = mid+1;
//         }
//       }
//        System.out.println("The highest peak index value in a given array: "+low);
        secondLogic();
    }


    public static void secondLogic(){
        int arr[] = {4, 6, 9, 11, 45, 40, 20, 1};
        int start = 0;
        int end = arr.length-1;
        int mid = (int) Math.floor(start + end /2);
        for(int i =0; i<=arr.length-1 ; i++){
             if(arr[mid]>arr[mid+1]){
                 end =  mid;
             }
             else {
                 start = mid+1;
             }
        }
        System.out.println("The highest peak index value in a given array: "+start);
    }
}
