package com.company;

public class SubArrayWithLeastAvg {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int curr_sum = 0;
        int res_index = 0;

        for (int i = 0; i < B; i++) {
            curr_sum += A[i];

        int min_sum = curr_sum;

        for (int j = B; j < n; j++) {
            curr_sum = curr_sum + A[j] - A[j - B];
            if (curr_sum < min_sum) {
                min_sum = curr_sum;
                res_index = (j - B + 1);
            }
        }
    }
        return res_index;
    }

    public static void main(String[] args) {
        int[] A={15,3,15,6,9,14,8,10,9,17};
        int B=1;
        System.out.println(solve(A,B));
    }
}
