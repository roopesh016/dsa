package probs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ReverseElementsOfQueue {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Deque<Integer> dQ = new ArrayDeque<>();
        for(int i=0; i<B; i++){
            dQ.add(A.get(i));
        }

        for(int i=0; i<B; i++){
            A.set(i,dQ.removeLast());
        }

        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);
//        A.add(5);
        int B = 2;
        System.out.println(solve(A,B));
    }
}
