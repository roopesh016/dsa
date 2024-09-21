package ADSA.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Triple {

    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int len = A.size(), ans = 0;
        int start = 1;
        int end = A.get(len - 1) + A.get(len - 2) + A.get(len - 3), mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            boolean flag = checkLess(A, B, mid);
            // System.out.print(flag);
            if (flag) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean checkLess(ArrayList<Integer> A, int B, int sum) {
        //  System.out.print(sum);
        int len = A.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int p1 = i + 1, p2 = len - 1;
            while (p1 < p2) {
                if (A.get(i) + A.get(p1) + A.get(p2) <= sum) {
                    count += p2 - p1;
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        if (count >= B) return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> X = new ArrayList<Integer>();
        X.add(1);
        X.add(5);
        X.add(7);
        X.add(3);
        X.add(2);
        System.out.println(solve(X,9));
    }
}
