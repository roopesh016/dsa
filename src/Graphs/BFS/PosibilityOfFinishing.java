package Graphs.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PosibilityOfFinishing {


    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
         graph.add(B);
         graph.add(C);
        ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<>();
         int[] x = new int[A+1];
         for(int i=0; i<=A; i++){
             adjGraph.add(new ArrayList<>());
         }

         for(int i=0;i<B.size(); i++){
             int start = B.get(i);
             int end = C.get(i);
             adjGraph.get(start).add(end);
             x[end]+=1;
         }


        Deque<Integer> deque = new ArrayDeque<>();
        //Add the zero angles in the queue
        for(int i=1; i<=A; i++){
            if(x[i]==0)
                deque.add(i);
        }

        int count =0;
        while(deque.size()!=0){
           int removedValue = deque.poll();
            count++;

            for(int i:adjGraph.get(removedValue)){
               x[i]--;
               if(x[i]==0)
                   deque.add(i);
           }
        }



         return count==A?1:0;
    }


    public static void main(String[] args) {
        PosibilityOfFinishing pF = new PosibilityOfFinishing();
        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
        B.add(2);
        B.add(3);

        ArrayList<Integer> C = new ArrayList<>();
        C.add(2);
        C.add(3);
        C.add(1);
        System.out.println(pF.solve(3,B,C));
    }
}
