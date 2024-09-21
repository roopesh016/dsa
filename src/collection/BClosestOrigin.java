package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BClosestOrigin {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        Collections.sort(A,new Check());
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<B; i++){
            ArrayList<Integer> Al = new ArrayList<>();
            Al.add(A.get(i).get(0));
            Al.add(A.get(i).get(1));
            ans.add(Al);
        }
        return ans;
    }
}


class Check implements Comparator<ArrayList<Integer>>{
    @Override
    public int compare(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int x1 = a1.get(0);
        int y1 = a1.get(1);

        int x2 = a2.get(0);
        int y2 = a2.get(1);

        int d1 = x1*x1+y1*y1;
        int d2 = x2*x2+y2*y2;

        if(d1<d2)
            return -1;
        else if(d1>d2)
            return 1;
        else
        return 0;
    }
}
