package ADSA.Recurssion;

public class IsMagic {

    public static int solve(int A) {
        if(check(A)==1)
            return 1;
        else
            return 0;

    }

    public static int check(int A){
        if(A<10)
            return A;
        int sum =0;
        while(A!=0){
            int r = A%10;
            sum+=r;
            A = A/10;
        }
        return check(sum);
    }
    

    public static void main(String[] args) {
        int A = 2;
        System.out.println(solve(A));
    }
}
