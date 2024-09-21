package ADSA;

public class FindGCDAmongArrays {


    public static int findGCD(int[] A){
        int ans = A[0];
        int N = A.length;
        for(int i =1 ; i < N ; i++){
            ans = gcd(ans,A[i]);
        }

        return ans;
    }


    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int[] A = {6,12,15};
        System.out.println(findGCD(A));
    }
}
