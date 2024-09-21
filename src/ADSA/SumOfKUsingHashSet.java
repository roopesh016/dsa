package ADSA;

import java.util.ArrayList;
import java.util.HashSet;

public class SumOfKUsingHashSet {

   //look only for elements on the left side
    public static boolean usingHashSet(int[] A, int K){
        int n = A.length;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i =0; i<n ; i++){
            int x = A[i];
            int y = K - x;

            if(hSet.contains(y))
                return true;

            hSet.add(x);
        }
        return false;
    }

    public static void check(){
        ArrayList<Integer> Al = new ArrayList<>();
        Al.get(0);
    }

    public static void main(String[] args) {
        int[] A = {8,9,-6,5,4,-2,5,1,7,11};
        int K = 11;
        System.out.println(usingHashSet(A, K));
    }
}
