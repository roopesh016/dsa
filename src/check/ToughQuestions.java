package check;

public class ToughQuestions {



    public static int onWhichDayToSellStock(int[] A){
      int n = A.length;
      int max_profit =0;
      for(int i=0;i<n; i++){
          for(int j=i+1;j<n;j++){
              int profit =0;
              if(A[i]<A[j]){
                  profit = A[j]-A[i];
              }
              max_profit = Math.max(max_profit,profit);
          }
      }
      return max_profit;
    }


    public static int optimizeSol(int[] A){
        int n = A.length;
        int max = A[n-1];
        int maxProfit =0;
        for(int i=n-2; i>=0; i--){
            int profit =0;
            if(A[i]>max) {
                max = A[i];
            }
            profit = max-A[i];
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }


    public static int slidingWindowMaxSum(int[] A,int k){
        int firstSum =0;
        int n = A.length;
        int l=0;
        int r=0;
        while(r<k){
            firstSum+=A[r];
            r++;
        }
        l++;
        int max_sum = firstSum;
        while(r<n){
            int ans =0;
            ans = A[l]+A[r];
            max_sum = Math.max(ans,max_sum);
            r++;
            l++;
        }
        return max_sum;
    }

    public static void main(String[] args) {
//        int[] A = {7,1,5,3,6,4};
        int[] A = {100, 200, 300, 400};
//        int ans = optimizeSol(A);
        int ans1 =slidingWindowMaxSum(A,2);
        System.out.println(ans1);
    }
}
