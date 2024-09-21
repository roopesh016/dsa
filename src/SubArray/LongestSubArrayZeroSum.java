package SubArray;

import java.util.ArrayList;

public class LongestSubArrayZeroSum {
    //Given an array A of N integers.
    //Find the length of the longest subarray in the array which sums to zero.
    //
    //If there is no subarray which sums to zero then return 0.

    public static int solve(ArrayList<Integer> A) {
        int ans =0;
        int n = A.size();
        int sum =0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int st = i; int end=j;
                for(int k=st; k<=end; k++){
                    sum+=A.get(k);
                    System.out.println(sum);
                }
                System.out.println();
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(-2);
        A.add(1);
        A.add(2);
        solve(A);
    }

}
