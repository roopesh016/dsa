package ADSA;

import java.util.ArrayList;

public class PrimeSum {

    public static ArrayList<Integer> primeSum(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<=A;i++) {
            int x = i;
            int y = A - x;
            if (isPrime(x) && isPrime(y)) {
                ans.add(x);
                ans.add(y);
                break;
            }
        }
        return ans;
    }

    public static boolean isPrime(int N) {
        boolean check = false;
        if (N >= 2) {
            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                check = true;


        }
        return check;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans  = primeSum(8);
        for(int i=0; i<=ans.size()-1; i++){
            System.out.println(ans.get(i));
        }
    }
    
}
