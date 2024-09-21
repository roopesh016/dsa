package ADSA.Permutation;


public class PermutationExample1 {


    public static int checkPermutation(int n , int r){
        int ans =0;

        int f1 = n;
        for(int i = n-1; i>=1; i--){
            f1 = f1*i;
        }

        r = n-r;


        int f2 = r;
        for(int d=r-1 ; d>=1; d--){
            f2 = f2*d;
        }
        ans = f1/f2;
        return ans;
    }

    public static void main(String[] args) {
        checkPermutation(6,2);
    }
}
