package ADSA;

public class SpecialScooby {


    public static int solve(int A,int B,int C){
       return (int) Math.floor(A/lcm(B,C));
    }


    public static int lcm(int A,int B){
       return A*B/gcd(A,B);
    }

    public static int gcd(int A,int B){
        if(B==0){
            return A;
        }

        return gcd(B,A%B);
    }


    public static void main(String[] args) {
       int A = 12;
       int B = 3;
       int C = 2;
        System.out.println(solve(A,B,C));
    }
}
