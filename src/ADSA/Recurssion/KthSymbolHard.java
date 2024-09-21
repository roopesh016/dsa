package ADSA.Recurssion;

public class KthSymbolHard {
    public static int solve(int A, Long B) {
        if(B==0){
            return 0;
        }
        int parent=solve(A-1,B/2);
        if(B%2==0){
            return parent;
        }
        else{
            return (1-parent);
        }
    }

    public static void main(String[] args) {
        int A =4;
        Long B = Long.valueOf(4);
        solve(A,B);
    }
}
