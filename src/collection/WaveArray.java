package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WaveArray {

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A,new WaveArrayOne());
        for(int i=0;  i<=A.size()-1; i++){
            if(i+1==A.size()-1){
                break;
            }
            int temp = A.get(i);
            A.remove(i);
            A.add(i,A.get(i+1));
            A.remove(i+1);
            A.add(i+1,temp);
        }
        return A;
    }


    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(5);
        Al.add(1);
        Al.add(3);
        Al.add(2);
        Al.add(4);
        wave(Al);
    }
}

class WaveArrayOne implements Comparator<Integer> {

    public int compare(Integer a , Integer b){
        if(a>=b)
            return 1;
        else if(a<=b)
            return -1;
        else
            return 0;
    }
}
