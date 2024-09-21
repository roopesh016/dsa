package ADSA;

public class MinXorValue {

    public static int findMinXor(int[] A) {

        int n = A.length;
        int min_xor = Integer.MAX_VALUE;
        for(int i=0; i<n ; i++){
            for(int j = i+1; j<n; j++){
                min_xor = Math.min(min_xor,A[i]^A[j]);
            }
        }
        return min_xor;
    }

    public static void main(String[] args) {

        int[] A ={0, 2, 5, 7};
        System.out.println(findMinXor(A));
    }

}
