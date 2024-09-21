package ADSA;

public class CompureNcR {

    public static int solve(int A, int B, int C) {
        int ans1 = fact(A)/(fact(B)*fact(A-B));
        return (ans1%C);
    }

    public static int fact(int A){
        int fact =1;
        for(int i=1;i<=A; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
       int A = 38;
       int B = 5;
       int C = 81;

       int ans = solve(A,B,C);
        System.out.println(ans);
    }


}
