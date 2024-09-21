package ADSA;

import java.util.HashMap;

public class CountPairSum {


    public static int countPairSum(int[] A, int k){
        int n = A.length;
        int count = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i=0; i<n ; i++){
            int x = A[i];
            int y = k-x;
            if(hMap.containsKey(y)){
                count = count + hMap.get(y);
            }
            hMap.put(x,hMap.getOrDefault(x,0)+1);
        }
        return count;
    }




    public static void main(String[] args) {
        int[] A = {8,9,5,-2,4,5,5,1,6,5};
        int k = 10;

        System.out.println(countPairSum(A,k));

    }
}
