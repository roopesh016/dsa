package ADSA.sorting;

public class Solution {
    public static long count = 0;
    public static int solve(int[] A) {
        mergeSort(A, 0, A.length-1);
        int mod = 1000000007;
        long ans = ((count % mod) + mod) % mod;
        count = 0; // reinitialize count with 0
        return (int)ans;
    }

    public static void mergeSort(int[] A, int s, int e) {
        if(s == e) {
            return;
        }

        int m = (s+e)/2;

        mergeSort(A, s, m);
        mergeSort(A, m+1, e);
        merge(A, s, m, e);
    }

    public static void merge(int[] A, int s, int m, int e) {
        int p1 = s;
        int p2 = m+1;
        int index = 0;

        int[] arr = new int[e-s+1];

        while(p1 <= m && p2 <= e) {
            if(A[p1] <= A[p2]) {
                arr[index] = A[p1];
                p1++; index++;
            }
            else {
                arr[index] = A[p2];
                p2++; index++;
                count = count + m-p1+1;
            }
        }

        while(p1 <= m) {
            arr[index] = A[p1];
            p1++; index++;
        }

        while(p2 <= e) {
            arr[index] = A[p2];
            p2++; index++;
        }

        index = 0;

        for(int i = s; i <= e; i++) {
            A[i] = arr[index];
            index++;
        }
    }

    public static void main(String[] args) {
//        int[] A = {10,5,3,8,6,2,17,12,18};
        int[] A = {3,4,1,2};
        System.out.println(solve(A));
    }
}
