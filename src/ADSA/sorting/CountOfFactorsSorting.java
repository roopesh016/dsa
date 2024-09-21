package ADSA.sorting;

import java.util.HashMap;
import java.util.Map;

public class CountOfFactorsSorting {


    public static void checkFactors(int[] A){
        int N = A.length;

        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0; i<N; i++){
            for(int j=1;j<=A[i];j++){
                if(A[i]%j==0) {
                    if(hMap.containsKey(A[i])){
                        int freq = hMap.get(A[i]);
                        hMap.put(A[i],freq+1);
                    } else{
                        hMap.put(A[i],1);
                    }
                }
            }
        }

        for(Map.Entry map: hMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());

        }


    }

    public static void main(String[] args) {
        int[] A = {6, 8, 9};
        checkFactors(A);
    }
}
