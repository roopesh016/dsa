package ADSA.Recurssion;

public class PrintAto1 {
    public static void solve(int A) {
        if(A==0){
            System.out.println();
            return;
        }


        System.out.print(A+" ");
        solve(A-1);

    }


    public static void main(String[] args) {
        int A = 5;
        solve(A);
    }
}
