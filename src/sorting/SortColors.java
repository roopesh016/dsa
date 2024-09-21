package sorting;

public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int curr = 0;

        while (curr <= r) {
            if (nums[curr] == 0) {
                //swap left with curr and increment the left + curr
                swap(nums, l, curr);
                curr++;
                l++;
            } else if (nums[curr] == 2) {
                //swap right with curr reduce the right;
                swap(nums, curr, r);
                r--;
            } else {
                curr++;
            }
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
