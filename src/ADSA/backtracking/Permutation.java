package ADSA.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        findpermutation(0,finalAns,A);
        return finalAns;
    }

    public static void findpermutation(int i , ArrayList<ArrayList<Integer>> finalAns, ArrayList<Integer> A){
        if(i == A.size()){
            finalAns.add(new ArrayList<>(A));
            return;
        }
        for(int j = i; j<A.size(); j++){
            Collections.swap(A, i, j);
            findpermutation(i+1, finalAns, A);
            Collections.swap(A, i, j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        permute(A);
    }
}
