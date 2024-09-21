package probs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaximumSlidingWindow {

    public static ArrayList<Integer> max(ArrayList<Integer> A, int B){
        Deque<Integer> dQ = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        //we have to use Max sliding window
        for(int i=0; i<B; i++){
            while(dQ.size()>0 && A.get(i)>dQ.getLast()){
                dQ.removeLast();
            }
            dQ.addLast(A.get(i));
        }
        ans.add(dQ.getFirst());

        int s = 1;
        int e = B;
        while(e<A.size()){

            if(A.get(s-1) == dQ.getFirst()){
                dQ.removeFirst();
            }

            while(dQ.size()>0 && A.get(e)>dQ.getLast()){
                dQ.removeLast();
            }
            dQ.addLast(A.get(e));

            ans.add(dQ.getFirst());
            s=s+1;
            e=e+1;
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(9);
        A.add(8);
        A.add(7);
        A.add(6);
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(2);
        int B =2;
        System.out.println(max(A,B));
    }
}
