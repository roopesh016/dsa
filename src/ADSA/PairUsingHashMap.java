package ADSA;

import java.util.HashMap;

public class PairUsingHashMap {


    public static boolean usingMap(int[] A, int sum){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int n = A.length;
        for(int i =0;i <n; i++){
            if(hMap.containsKey(A[i])){
                int frq = hMap.get(A[i]);
                hMap.put(A[i],frq+1);
            }
             else {
                 hMap.put(A[i],1);
            }
        }


        for(int i =0; i<n ; i++){
            int x = A[i];
            int y = sum-x;

            if((x==y) && (hMap.containsKey(y)) && (hMap.get(y)>1))
                return true;

            if((x!=y) && (hMap.containsKey(y)))
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] A = {8,9,5,2,4,5,7,9,8,5};
        int sum = 10;
        System.out.println(usingMap(A,sum));
    }
}
