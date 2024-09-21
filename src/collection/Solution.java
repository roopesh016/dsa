package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new CountFactors());
        return A;
    }
}

class  CountFactors implements Comparator<Integer> {
    int factors(int n){
        int count =0;
        for(int j=1;j<=n;j++){
            if(n%j==0) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public int compare(Integer a1, Integer a2) {

        int fA= factors(a1);
        int fB= factors(a2);

        if(fA < fB)
            return -1;
        else if(fA > fB)
            return 1;
        else {
            if(a1>a2)
                return 1;
            else if (a1<a2)
                return -1;
            else
                return 0;
        }
    }
}
