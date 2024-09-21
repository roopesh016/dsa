package ADSA;

public class LargestCoprimeDivisor {


    public static int cpFact(int A, int B){
        int ans = 0 ;
        for(int i =1; i<=A ; i++){
            if(A%i ==0){
                if(gcd(i,B)==1){
                    ans = i;
                }
            }
        }
        return ans;
    }

    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        System.out.println(cpFact(A,B));
    }
}
