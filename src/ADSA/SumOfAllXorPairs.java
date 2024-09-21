package ADSA;

public class SumOfAllXorPairs {

    public static int solve(int[] A) {
        long ans =0;
        long mod = 1000000007;
        int n = A.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                ans += A[i]^A[j];
            }
        }
        ans = ans%mod;
        return  (int) ans;
    }

    public static void main(String[] args) {
      int[] A ={1,2,3};
        System.out.println(solve(A));
    }
}
