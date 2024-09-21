package com.company;

public class FindArrayUsingBinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int search = 23;
        int low = 0;
        int high = arr.length - 1;
        for (int i = 1; i <= high; i++) {
            int mid = low + (high - low) / 2;
            if (search > arr[mid]) {
                low = mid + 1;
            } else if(search < arr[mid]) {
                high = mid -1;
            } else if(search == arr[mid]) {
                System.out.println("The index value is :" +mid);
                break;
            }
        }
    }
}

//o(log N) -> Avg & worst case
// o(N) -> best case

