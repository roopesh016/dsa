package Graphs;

import java.util.ArrayList;

public class CycleDirectedGraph {
    boolean[] visited;
    boolean[] path ;
    ArrayList<ArrayList<Integer>> getAdjList;
    public ArrayList<ArrayList<Integer>> getAdjacentList(int N, int[][] edges){
        ArrayList<ArrayList<Integer>> x1 = new ArrayList<>();

        for(int i=0; i<=N; i++){
            x1.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length; i++) {
                int start = edges[i][0];
                int end = edges[i][1];
                x1.get(start).add(end);
        }
        return x1;
    }
    //we have to store the path as well
    public int solve(int A, int[][] B) {

        getAdjList = getAdjacentList(A,B);
        this.visited = new boolean[A+1];
        this.path = new boolean[A+1];
       for(int i=1;i<=A; i++){
           if(!visited[i] && dfs(i))
                   return 1;

       }
        return 0;
    }

    public boolean dfs(int i ){
        visited[i] = true;
        path[i] = true;
        for(int neighbour: getAdjList.get(i)){
                if(path[neighbour])
                    return true;
                if(!visited[neighbour]){
                    if(dfs(neighbour))
                        return true;
                }
        }
        //Need to backtack
        path[i] = false;
        return false;
    }




    public static void main(String[] args) {
        CycleDirectedGraph cycleDirectedGraph = new CycleDirectedGraph();
//        int[][] A = {
//                {1, 2},
//                {4, 1},
//                {2, 4},
//                {3, 4},
//                {5, 2},
//                {1, 3}
//        };

//        int[][] A = {
//                {1, 2},
//                {2, 3},
//                {3, 4},
//                {4, 5}
//        };

        int [][] A = {
                {1,4},{2,1},{4,3},{4,5},{2,3},{2,4},{1,5},{5,3},{2,5},{5,1},{4,2},{3,1},{5,4},{3,4},{1,3},{4,1},{3,5},{3,2},{5,2}
        };

        System.out.println(cycleDirectedGraph.solve(5,A));
    }
}
