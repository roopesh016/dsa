package com.company;

public class EvenOddSubArrays {


    public static int count(int[] A,int B){

        int n = A.length;
        int goodSubarrays = 0;

        for (int s = 0; s < n; s++) {
            int sum = 0;

            for (int e = s; e < n; e++) {
                sum += A[e];

                if ((e - s + 1) % 2 == 0 && sum < B) {
                    goodSubarrays++;
                }
                if ((e - s + 1) % 2 != 0 && sum > B) {
                    goodSubarrays++;
                }
            }
        }

        return goodSubarrays;
    }

    public static void main(String[] args) {
      int[] A ={1, 2, 3, 4, 5};
      int B =4;
        System.out.println(count(A,B));
    }
}
