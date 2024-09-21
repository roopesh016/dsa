package Graphs.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TropologicalSort {

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> check = new ArrayList<>();
        for(int i=0;i<=A; i++){
            check.add(new ArrayList<>());
        }

        int[] inDegree = new int[A+1];
        for(int i=0; i<B.size(); i++){
            int start = B.get(i).get(0);
            int end = B.get(i).get(1);
            check.get(start).add(end);
            inDegree[end]++;
        }

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1;i<=A; i++){
            if(inDegree[i]==0)
                deque.add(i);
        }

        while(deque.size()!=0){
           int removedQueue = deque.poll();
           ans.add(removedQueue);
           for(int neighbour: check.get(removedQueue)){
               inDegree[neighbour]--;
               if(inDegree[neighbour]==0)
                   deque.add(neighbour);
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        TropologicalSort ts = new TropologicalSort();
        int A = 6;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> X = new ArrayList<>();
        X.add(6);
        X.add(3);

        ArrayList<Integer> L = new ArrayList<>();
        L.add(6);
        L.add(1);

        ArrayList<Integer> K = new ArrayList<>();
        L.add(5);
        L.add(1);

        ArrayList<Integer> M = new ArrayList<>();
        M.add(5);
        M.add(2);

        ArrayList<Integer> N = new ArrayList<>();
        M.add(3);
        M.add(4);

        ArrayList<Integer> Y = new ArrayList<>();
        Y.add(4);
        Y.add(2);


        B.add(X);
        B.add(L);
        B.add(K);
        B.add(M);
        B.add(N);
        B.add(Y);

        System.out.println(ts.solve(A,B));
    }
}
