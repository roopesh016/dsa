package ADSA;

import java.util.HashMap;

public class SumAsZero {


    public static int maxSubLen(int[] A,int k) {

        int ans = 0;
        int n = A.length;
        HashMap<Long,Integer> hMap = new HashMap<>();
        hMap.put(0L,-1);
        long sum =0;
        for(int i =0; i<n ;i++){
            sum +=A[i];
            long x = sum;
            long y = x-k;
            int length =0;
            if(hMap.containsKey(y)){
               length = i-hMap.get(y);
               ans = Math.max(length,ans);
            }else{
                hMap.put(y,i);
            }
        }
       return ans;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, -1};
        System.out.println(maxSubLen(A,0));
    }
}
