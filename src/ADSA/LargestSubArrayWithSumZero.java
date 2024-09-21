package ADSA;

import java.util.HashMap;

public class LargestSubArrayWithSumZero {


    public static int bruteForce(int[] A, int N){
        int ans = 0;

        for(int i=0; i <=N-1; i++){
            for(int j =i; j<=N-1 ; j++) {
                int sum = 0;
                for(int k=i;k<=j;k++) {
                    sum +=A[k];
                }
                if(sum==0){
                    int x = j-i+1;
                    ans = Math.max(ans,x);
                }
            }
        }
        return ans;
      }

    //Using o(n), HashMap
    public static int solve(int[] A, int B) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int N = A.length;
        int count = 0 ;
        for(int i=0; i<N ; i++){
            if(hm.containsKey(B+A[i])){
                count=count+hm.get(B+A[i]);
            }
            if(hm.containsKey(A[i]-B)){
                count=count+hm.get(A[i]-B);
            }
            if(hm.containsKey(A[i])){
                int val=hm.get(A[i]);
                hm.put(A[i],val+1);
            }
            else{
                hm.put(A[i],1);
            }
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
        int[] A = {3,5,1,2};
        int B = 4 ;
        System.out.println(solve(A,B));
    }
}
