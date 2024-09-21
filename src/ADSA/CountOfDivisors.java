package ADSA;

public class CountOfDivisors {


    public static int[] solve(int[] A) {
        int n = A.length;
        int maxArr = A[0];
        for(int i : A){
            maxArr = Math.max(i , maxArr);
        }
        int[] cf = new int[maxArr+1];
        for(int i = 1; i<= maxArr; i++){
            for(int j = i ; j<= maxArr; j+= i){
                cf[j]++;
            }
        }
        int[] ans = new int[n];
        for(int i =0; i< n; i++){
            ans[i]= cf[A[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A ={2, 3, 4, 5};
        solve(A);
    }
}
