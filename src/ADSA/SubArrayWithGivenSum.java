package ADSA;

import java.util.HashMap;

public class SubArrayWithGivenSum {


   public static int fetchCountPairs(int[] A, int k){
       int n = A.length;
       HashMap<Integer, Integer> hMap = new HashMap<>();
       int sum =0;
       hMap.put(0,1);
       int ans =0;
       for(int i=0; i<n ; i++){
           sum+=A[i];
           int y = sum-k;
           if(hMap.containsKey(y)){
               ans +=hMap.get(y);
           }
           if(hMap.containsKey(sum)){
               hMap.put(sum,hMap.get(sum)+1);
           }else {
               hMap.put(sum,1);
           }
       }
       return ans;
   }


    public static void main(String[] args) {
           int[] A = {1, 0, 1};
           int K = 1;

        System.out.println(fetchCountPairs(A,K));
    }
}
