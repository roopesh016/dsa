package Graphs.BFS;

import java.util.*;

public class AnotherBFSSolution {
    public int solve(int A, int[][] B, int C, int D) {
        // To save the Graph
        HashMap<Integer, List<Pair>> map = new HashMap<>();
        // Will add dummy nodes starting from A
        int k=A;
        for(int i=0;i<A;i++)
            map.put(i, new ArrayList<>());
        for(int i=0;i<B.length;i++){
            int node = B[i][0];
            int edge = B[i][1];
            int weight = B[i][2];
            // If weight is two adds a new dummy node between the node and edge
            if(weight==2) {
                map.put(k, new ArrayList<Pair>());
                map.get(node).add(new Pair(node, k));
                map.get(k).add(new Pair(k, node));
                map.get(k).add(new Pair(k, edge));
                map.get(edge).add(new Pair(edge, k));
                k++;
            } else {
                map.get(node).add(new Pair(node, edge));
                map.get(edge).add(new Pair(edge, node));
            }
        }
        // Visited array till k nodes including dummy nodes
        // It also holds the level we are at.
        int[] vis = new int[k];
        Arrays.fill(vis, -1);
        Deque<Pair> deq = new ArrayDeque<>();
        vis[C]=0;
        // Adds the source node edges to queue
        for(Pair p : map.get(C))
            deq.add(p);
        while(!deq.isEmpty()) {
            Pair pair = deq.poll();
            if(vis[pair.edge]!=-1)
                continue;
            //Update the visited level by +1 because we are moving one level from the prev node
            vis[pair.edge]=vis[pair.node]+1;
            for(Pair p : map.get(pair.edge)) {
                if(vis[p.edge]==-1)
                    deq.add(p);
            }
        }
        // Just reurn the level direclty from the visited array.
        return vis[D];
    }

    public static void main(String[] args) {
        int  A = 6;
        int [][]  B = {  {2, 5, 1},
                {1, 3, 1},
                {0, 5, 2},
                {0, 2, 2},
                {1, 4, 1},
                {0, 1, 1}
        };
        int  C = 3;
        int  D = 2;
        AnotherBFSSolution ABFS = new AnotherBFSSolution();

        ABFS.solve(A,B,C,D);

    }
}


class Pair {
    int node, edge;
    Pair(int node, int edge) {
        this.node=node;
        this.edge=edge;
    }
}
