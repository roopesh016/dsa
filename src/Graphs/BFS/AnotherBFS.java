package Graphs.BFS;

import java.util.*;

public class AnotherBFS {


    public int solve(int A, ArrayList<ArrayList<Integer>> B, int C, int D) {
        HashMap<Integer, List<Pair>> map = new HashMap<Integer, List<Pair>>();
        int k = A;
        for(int i=0; i<A; i++)
            map.put(i,new ArrayList<>());

        //Constructed the graph by adding extra nodes
        for(int i=0;i<B.size(); i++){
            int node = B.get(i).get(0);
            int edge = B.get(i).get(1);
            int weight = B.get(i).get(2);
            if(weight==2){
                map.put(k,new ArrayList<>());
                map.get(node).add(new Pair(node,k));
                map.get(k).add(new Pair(k,node));
                map.get(k).add(new Pair(k,edge));
                map.get(edge).add(new Pair(edge,k));
                k++;
            }else{
               map.get(node).add(new Pair(node,edge));
               map.get(edge).add(new Pair(edge,node));
            }
        }

        // Visited array till k nodes including dummy nodes
        // It also holds the level we are at.
        int[] vis = new int[k];
        Arrays.fill(vis, -1);
        Deque<Pair> deq = new ArrayDeque<>();
        vis[C]=0;
        for(Pair p:map.get(C))
            deq.add(p);
        while(deq.size()!=0){
           Pair removedP = deq.poll();
           if(vis[removedP.edge]!=-1)
               continue;
           //update the visited node to +1;
           vis[removedP.edge]=vis[removedP.node]+1;
            for(Pair p : map.get(removedP.edge)) {
                if(vis[p.edge]==-1)
                    deq.add(p);
            }
        }

        return vis[D];
    }



    public static void main(String[] args) {
      int  A = 6;

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> L = new ArrayList<>();
        L.add(2);
        L.add(5);
        L.add(1);

        ArrayList<Integer> M = new ArrayList<>();
        M.add(1);
        M.add(3);
        M.add(1);

        ArrayList<Integer> N = new ArrayList<>();
        N.add(0);
        N.add(5);
        N.add(2);

        ArrayList<Integer> O = new ArrayList<>();
        O.add(0);
        O.add(2);
        O.add(2);

        ArrayList<Integer> P = new ArrayList<>();
        P.add(1);
        P.add(4);
        P.add(1);

        ArrayList<Integer> Q = new ArrayList<>();
        Q.add(0);
        Q.add(1);
        Q.add(1);

        B.add(L);
        B.add(M);
        B.add(N);
        B.add(O);
        B.add(P);
        B.add(Q);

      int  C = 3;
      int  D = 2;

        AnotherBFS anotherBFS = new AnotherBFS();
        System.out.println(anotherBFS.solve(A,B,C,D));

    }
}

