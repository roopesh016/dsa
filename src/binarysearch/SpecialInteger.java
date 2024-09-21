package binarysearch;

import java.util.ArrayList;

public class SpecialInteger {

    //using o(nlogn) approach
    //First find the subarrays sum

    public static int solve(ArrayList<Integer> A, int B) {
        int ans = 0;
        int low = 0;
        int high = A.size()-1;
        while (low<=high){
            int mid = low+(high - low)/2;

            if(check(A,mid,B)){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    //finding the sub arrays sum
    public static boolean check(ArrayList<Integer> A, int mid, int B){
        if(mid==0){
            for(int i=0;i< A.size(); i++){
                if(A.get(i)>B)
                    return  false;
            }
            return true;
        }

        int sum =0;
        for(int i=0; i<= mid; i++){
            sum +=A.get(i);
        }

        if(sum > B){
            return false;
        }



        for(int i=mid ; i<A.size();i++){
            // remove 1st ele in subarray.
            sum = sum - A.get(i-mid);
            //add the last ele in the subarray
            sum = sum + A.get(i);
            if(sum > B){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         ArrayList<Integer> x = new ArrayList<>();
         x.add(5);
         x.add(10);
         x.add(20);
         x.add(100);
         x.add(105);
         int B = 130;
        System.out.println(solve(x,B));
    }
}
