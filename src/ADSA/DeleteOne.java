package ADSA;

public class DeleteOne {

    //GCD property GCD(A,B) = GCD(B,A%B)

    public static int deleteOne(int[] A) {
        int N = A.length;

        int pf_gcd[] = pfGcd(A);

        int value =0;

        int ans = 0;

        int sf_gcd[] = sfGcd(A);


        for(int i =0; i<N ; i++){

            int left = 0;
            if(i>0){
                left = pf_gcd[i-1];
            }

            int right =0;

            if(i!=N-1){
                right = sf_gcd[i+1];
            }

            value = findGCD(left,right);

            ans  = Math.max(ans,value);

        }
        return ans;
    }


    public static int[] pfGcd(int[] A){
        int[] pf = new int[A.length];
        int ans = 0 ;

        for(int i =0 ; i<pf.length ; i++){

            ans = findGCD(ans, A[i]);
            pf[i] = ans;
        }

        return pf;
    }

    public static int[] sfGcd(int[] A){
        int[] sf = new int[A.length];
        int  ans =0;

        for(int i=A.length-1 ; i>=0; i--){

            ans = findGCD(ans,A[i]);
            sf[i] = ans;

        }
        return sf;
    }


    public static int findGCD(int a,int b){
        if(b ==0){
            return a;
        }

        return findGCD(b,a%b);
    }

    public static void main(String[] args) {
        int[] A = {12, 15, 18};
        System.out.println(deleteOne(A));
    }
}
