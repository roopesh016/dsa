package com.company;

public class Common {

    public static void main(String[] args) {
        int[] A = {2,1,4,10};
        int[] B = {3,6,2,10,10};
        int[] result = solve(A, B);

        // Print the non-zero elements of the result array
        for (int num : result) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                    break; // Break out of the inner loop once a common element is found
                }
            }
        }


        // Create an array to store the non-zero common elements
        int[] x = new int[count];
        int index = 0; // Index to track where to add elements in the new array

        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<B.length-1; j++){
                if(A[i] == B[j]){
                    x[index]=A[i];
                    index++;
                    break;
                }
            }
        }
        return x;
    }
}
