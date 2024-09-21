package preperation;

import java.util.PriorityQueue;

public class FindKthLargestNumber {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> x = new PriorityQueue<>();
        int ans =0;
        for(int i=0; i<nums.length; i++){
            x.add(nums[i]);
            if(x.size()>k)
                x.remove();
        }
        return x.peek();
    }

    public static void main(String[] args) {
         int[] A = {2,1,4,6,3,9,7};
         int k =1;
        System.out.println(findKthLargest(A,k));
    }
}
