package Graphs;

import java.util.ArrayList;

public class PathInDirectedGraph {

    //We use Breadth first search
    //1. We will create a queue /  maintain a queue
    //2. For every node in queue we first visit the node
    //3. If(queue(node) isA) then return true;
    //4. else keep adding the nodes

    //global variable for visited node
    boolean[] visited;
    //global ArrayList for creating and passing Adjacency List
    ArrayList<ArrayList<Integer>> graph;

    //Uitility code for doing depth first search
    private void depthSearch(int node) {
        //Traverse through all the unvisited nodes of the graph
        //from the first node to all its neighbours
        //If at the end the Ath node is marked true in the visited array
        //Then that means there is a path

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                visited[neighbour] = true;
                depthSearch(neighbour);
            }
        }
    }


    public int solve(int A, ArrayList<ArrayList<Integer>> edges) {

        createAdjacencyList(A, edges);
        //Uitility Array to mark the visited nodes
        this.visited = new boolean[A + 1];

        //Marking the 1st node, that is, 1 as visited
        //Then executing depth first search

        this.visited[1] = true;
        depthSearch(1);

        //If after the function call for depthSearch is complete
        //And the visited[A-th] node is marked true
        //Then that means there exists a path from 1 to the A-th node

        if (visited[A]) {
            return 1;
        }

        return 0;
    }

    private void createAdjacencyList(int N, ArrayList<ArrayList<Integer>> edges) {

        this.graph = new ArrayList <> ();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList <Integer> ());
        }

        int M = edges.size();

        for (int i = 0; i < M; i++) {
            int start = edges.get(i).get(0);
            int end = edges.get(i).get(1);

            //Only adding start to end
            //Because this is a directed graph
            //So only one direction will be there
            graph.get(start).add(end);

            //If the graph is undirected
            //Then we should also add end to start
            // graph.get(end).add(start);
        }
    }

    public static void main(String[] args) {
        PathInDirectedGraph x = new PathInDirectedGraph();
//        int[][] twoDArray= {
//                {1, 2},
//                {4, 1},
//                {2, 4},
//                {3, 4},
//                {5, 2},
//                {1, 3}
//        };
        int[][] twoDArray = {{1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };

        ArrayList<ArrayList<Integer>> edges = new ArrayList <> ();
        int k = twoDArray.length;
        for(int i=0;i<k; i++){
            ArrayList<Integer> edge = new ArrayList<>();
            for(int j=0; j<twoDArray[0].length;j++){
                int value = twoDArray[i][j];
                edge.add(value);
            }
            edges.add(edge);
        }

        x.solve(5,edges);
    }
}
