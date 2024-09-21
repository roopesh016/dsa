package Graphs.BFS;

import java.util.*;

public class RottenOranges {

    public int solve(ArrayList<ArrayList<Integer>> A) {

        int fresh = 1;
        int rotten = 2;

        Queue<int[]> coordinatesQueue = new ArrayDeque<>();
        int n = A.size();
        int m = A.get(0).size();
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                int[] xyCoordinates = new int[2];
                if(A.get(i).get(j)==rotten){
                    xyCoordinates[0]=i;
                    xyCoordinates[1]=j;
                    coordinatesQueue.add(xyCoordinates);
                }
            }
        }

        int[] dX = {0,1,0,-1};
        int[] dY = {1,0,-1,0};
        int time = 0;
        while(coordinatesQueue.size()!=0) {
           int size = coordinatesQueue.size();
           for(int i=0; i<size; i++){
               int[] cell = coordinatesQueue.remove();
               int x = cell[0];
               int y = cell[1];

               for(int j=0; j<=3; j++){
                   int newX = x+dX[j];
                   int newY = y+dY[j];
                   if(newX >=0 && newY>=0 && newX<n && newY<m && A.get(newX).get(newY)==fresh){
                       int[] xyCoordinates = new int[2];
                       xyCoordinates[0]=newX;
                       xyCoordinates[1]=newY;
                       A.get(newX).set(newY,2);
                       coordinatesQueue.add(xyCoordinates);
                   }
               }
           }

            if(!coordinatesQueue.isEmpty()){
                time++;
            }
        }



        for(int i=0; i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(A.get(i).get(j)==fresh)
                    return -1;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        RottenOranges rO = new RottenOranges();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        B.add(0);
        B.add(2);
        B.add(1);


        ArrayList<Integer> C = new ArrayList<>();
        C.add(2);
        C.add(2);
        C.add(1);

        ArrayList<Integer> D = new ArrayList<>();
        D.add(0);
        D.add(1);
        D.add(0);

        ArrayList<Integer> E = new ArrayList<>();
        E.add(2);
        E.add(1);
        E.add(1);

        ArrayList<Integer> F = new ArrayList<>();
        F.add(0);
        F.add(1);
        F.add(1);

        ArrayList<Integer> G = new ArrayList<>();
        G.add(1);
        G.add(2);
        G.add(1);

        A.add(B);
        A.add(C);
        A.add(D);
        A.add(E);
        A.add(F);
        A.add(G);

        System.out.println(rO.solve(A));
    }
}
