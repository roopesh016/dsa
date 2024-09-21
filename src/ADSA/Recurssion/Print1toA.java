package ADSA.Recurssion;

public class Print1toA {

    public static void solve(int A) {
        if(A==0){
            System.out.println();
            return;
        }

        solve(A-1);
        System.out.print(A +" ");
    }


    public static void main(String[] args) {
        int A =10;
        solve(A);
    }
}
