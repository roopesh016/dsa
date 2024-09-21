package ADSA;

public class SubArrayOr {

    public static int solve(int[] A) {
        long ans =0 ;
        int mod = 1000000007 ;
        long n = A.length ;
        long total = (n * (n+1))/2 ;
        for(int i = 0 ; i<32 ; i++){
            long count = total ;
            long prev=0 ;
            for(int j = 0 ; j<A.length ; j++){
                if(((A[j] >> i ) & 1 ) == 0){
                    count += (prev*(prev+1))/2 ;
                    prev+=1 ;
                    count-= (prev * (prev+1))/2 ;
                }
                else{
                    prev = 0 ;
                }
            }
            ans+=((1<<i ) * count ) ;

            ans = ans %mod ;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        solve(A);
    }
}
