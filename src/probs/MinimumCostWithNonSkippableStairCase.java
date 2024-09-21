package probs;

import java.util.ArrayList;

public class MinimumCostWithNonSkippableStairCase {

    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();

        int i=0;
        int ans = 0;

        if(N-1==B)
            return A.get(N-1);

        while(i<N){
            if(i==B && i+1<B){
                i++;
            }
            else{
                if(i+1<B){
                    i+=2;
                }
            }
            ans = ans+A.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumCostWithNonSkippableStairCase minWSS = new MinimumCostWithNonSkippableStairCase();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(3);
        minWSS.solve(A,0);
    }
}
