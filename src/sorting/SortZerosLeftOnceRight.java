package sorting;

public class SortZerosLeftOnceRight {

    public static int[] sortZerosLeftOnceRight(int[] nums){
        int n = nums.length;
        int l =0;
        int r = n-1;
        int curr = 0;
        while(curr<=r){
            if(nums[curr]==0){
                swap(nums,curr,l);
                l++;
                curr++;
            }else{
                swap(nums,curr,r);
                l++;
                curr++;
                r--;
            }
        }
        return nums;
    }

    public static int[] usingCountSort(int[] nums){
        int[] freq = new int[nums.length];
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            freq[val]++;
        }

        int x =0;
        for(int i=0; i<freq.length; i++){
            int count = freq[i];
            for(int j=1; j<=count;j++) {
                ans[x] = i;
                x++;
            }
        }
        return ans;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,0,1,0};
        usingCountSort(nums);
    }
}
