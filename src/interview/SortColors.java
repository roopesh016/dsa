package interview;

public class SortColors {

    //can be done using 2 pointer technique
    public static void sortColors(int[] nums){
       int n = nums.length;
       int p1 =0;
       int p2 =n-1;
       int curr =0;
       while(curr<=p2){
           if(nums[p1] == 0){
               swap(nums,curr,p1);
               p1++;
               curr++;
           }
           else if(nums[curr] == 2){
               swap(nums,curr,p2);
               p2--;
           }else{
               curr++;
           }
       }
    }

    public static void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public static void main(String[] args) {
      int[] A = {2,0};
      sortColors(A);
    }
}
