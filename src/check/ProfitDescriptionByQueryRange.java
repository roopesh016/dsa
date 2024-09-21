package check;

public class ProfitDescriptionByQueryRange {


    public static int[] profit(int[] A,int[][] Q) {
         //Find the prefix sum based upon profit
        //1,1,2
        int n = A.length;
        int[] prefixSumArray = new int[n];

        if(A[0]>=0){
            prefixSumArray[0] = 1;
        }else{
            prefixSumArray[0] = 0;
        }

        for(int i=1;i<n; i++){
            if(A[i]>=0){
                prefixSumArray[i]= prefixSumArray[i-1]+1;
            }else {
                prefixSumArray[i] = prefixSumArray[i-1];
            }
        }

        int[] ans = new int[Q.length];
        for(int i=0; i<Q.length; i++){
           int left = Q[i][0];
           int right =   Q[i][1];

           if(left ==0)
               ans[i] = prefixSumArray[right];
           else
               ans[i] = prefixSumArray[right]-prefixSumArray[left-1];
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] A ={1,-1,0};
        int[] A ={1,2,4,-2,3,-4};
//        int[][] Q =new int[2][2];
//        Q[0][0] =0;
//        Q[0][1] =2;
//        Q[1][0] =1;
//        Q[1][1] =2;
        int[][] Q =new int[3][2];
        Q[0][0]=0;
        Q[0][1]=3;
        Q[1][0]=1;
        Q[1][1]=4;
        Q[2][0]=2;
        Q[2][1]=3;
        int[] ans = profit(A,Q);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
