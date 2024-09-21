package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TensdigitSorting {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new IncreasingOrder());
        return A;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(11);
        al.add(7);
        al.add(19);
        solve(al);
    }
}

class IncreasingOrder implements Comparator<Integer> {

    public int compare(Integer a , Integer b){
        int tensA = (a/10)%10;
        int tensB = (b/10)%10;
        if(tensA==tensB)
        {
            return b-a;
        }
        return tensA-tensB;
    }
}
