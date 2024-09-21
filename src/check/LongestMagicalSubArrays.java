package check;

public class LongestMagicalSubArrays {

    public static int check(int[] A){
        int n = A.length;
        //Find the subArrays

        int ans =0;
        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){

                int start = i;
                int end = j;
                int count =0;
                for(int k=start;k<end; k++) {
                    if(A[k]%2==0 || A[k]%3==0){
                        count++;
                    }
                }
                if(count>ans){
                    ans = count;
                }
            }
        }
        return ans;
    }



    static int longestsubarray(int arr[], int n, int k1, int k2)
    {
        int current_count = 0;

        // this will contain length of
        // longest subarray found
        int max_count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % k1 == 0 || arr[i] % k2 ==0)
                current_count++;
            else
                current_count = 0;
            max_count = Math.max(current_count, max_count);
        }
        return max_count;
    }


    public static void main(String[] args) {
        int[] A ={26,23,23,16,27,18,7,3,17};
        System.out.println(longestsubarray(A,9,2,3));
     }
}
