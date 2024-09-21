package ADSA;

public class MinimumSwapsOfConcecutiveOnce {

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int countOfOnce = 0;

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(nums[i]==1){
                countOfOnce++;
            }
        }

        int value =0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                int r =0;
                for(int j=i-1; j>=0; j--){
                    if(nums[j]==1)
                        r++;
                    else
                        break;
                }

                int l=0;
                for(int k=i+1; k<n; k++){
                    if(nums[k]==1)
                        l++;
                    else
                        break;
                }

                if(l+r==countOfOnce){
                    value = l+r+1;
                } else{
                    value = l+r;
                }

                if(value<ans){
                    ans = value;
                }
            }
        }
        return ans;
    }


    //using sliding window technique
    public static int min(int[] nums) {
        int n = nums.length;
        int k =0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
               k++;
            }
        }

        int l=0;
        int r=0;
        int x =0;
        while(r<k){
            if(nums[r]==0){
               x++;

            }
            r++;
        }
       int ans = x;
        while(r<n){
            if(nums[r]==0){
                x++;
            }

            if(nums[l]==0){
                x++;
            }

            ans = Math.min(ans,x);
            r++;
            l++;
        }
    return ans;

    }

    public static void main(String[] args) {
//        int[] nums = {0,1,1,1,0,0,1,1,0};
        int[] nums = {1,1,0,0,1};
        System.out.println(min(nums));
    }
}
