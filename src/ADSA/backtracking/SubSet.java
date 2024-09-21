package ADSA.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSet {
    static ArrayList<ArrayList<Integer>> arr;
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        arr=new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        ArrayList<Integer> temp=new ArrayList<>();
        arr.add(new ArrayList(temp));
        createAllSubsets(A, temp, 0);
        return arr;
    }
    static void createAllSubsets(ArrayList<Integer> A,ArrayList<Integer> temp, int idx )
    {
        if(idx==A.size())
        {
            return ;
        }
        temp.add(A.get(idx));
        arr.add(new ArrayList(temp));
        createAllSubsets(A, temp, idx+1);
        temp.remove(temp.size()-1);
        createAllSubsets(A, temp, idx+1);

    }

    public static void main(String[] args) {

    }
}
