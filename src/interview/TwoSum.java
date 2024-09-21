package interview;

import java.util.HashMap;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //It can be asked as Good pair / two sum
    //Example 1:
    //
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    //Here the approach could be of 2 types
     //Greedy approach o(n^2) which would be target- nums[i] and then iterate the ar entire array with i+1
     //o(n)

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int check[] = new int[2];
        int x =0;
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0; i<n; i++){
            int ans = target - nums[i];
            if(hMap.containsKey(ans)){
                check[x] = i;
                check[x+1] = hMap.get(ans);
                break;
            }else{
                hMap.put(nums[i],i);
            }
        }
        return check;
    }

    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        for(int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
