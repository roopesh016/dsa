package Graphs.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BreadthFirstSearch {

    boolean[] visited ;
    ArrayList<ArrayList<Integer>> graph;
    public ArrayList<ArrayList<Integer>> adjacentList(int[][] nodes, int A){
        ArrayList<ArrayList<Integer>> x1 = new ArrayList<>();
        for(int i=0; i<=A; i++){
             x1.add(new ArrayList<>());
         }

        for(int i=0; i<nodes.length; i++){
            int start = nodes[i][0];
            int end = nodes[i][1];

            x1.get(start).add(end);
        }
        return x1;
    }


    public void bfs(int[][] nodes, int A){
        //get the adjacent list
        this.graph = adjacentList(nodes,A);
        this.visited = new boolean[A+1];
        Queue<Integer> x = new ArrayDeque<>();

        visited[1]=true;
        System.out.println(1);
        x.add(1);
        while (x.size()!=0){
           int y = x.remove();
           for(int neighbour: graph.get(y)){
               x.add(neighbour);
               visited[neighbour]=true;
               System.out.println(neighbour);
           }
        }
    }

    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2}, {1, 3}, {2, 3}, {3, 4}, {2, 5}};

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.bfs(B,A);
    }
}
