package Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInAMaze {


    public int solve(int[][] A, int[] B, int[] C) {
        int n = A.length;
        int m = A[0].length;

        int[] dir = {0, 1, 0, -1, 0};

        boolean[][] vis = new boolean[n][m];
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(B[0], B[1], 0));//B[0]= starting point row, B[1]= col, 0= steps count

        while(!q.isEmpty()){
            Point currPoint = q.poll();//get the first Point
            int currRow = currPoint.row;
            int  currCol = currPoint.col;

            //now check if currPoint row and col match the destination
            if(currRow == C[0] && currCol == C[1]){
                return currPoint.steps;
            }

            //if we did not reached to our destination start checking in all 4 dir
            for(int i = 0; i<dir.length-1; i++){
                int nRow = currRow;
                int nCol = currCol;
                int step = currPoint.steps;
                while(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && A[nRow][nCol] == 0){
                    nRow += dir[i];
                    nCol += dir[i+1];
                    step++;
                }
                nRow -= dir[i];
                nCol -= dir[i+1];
//                step–=1;
                //now check the roe and col are vis or not
                //if not add our nRow and nCol in queue for further iteration
                //and make the curr roe and col vis.
                if(!vis[nRow][nCol]){
                    q.add(new Point(nRow, nCol, step));
                    vis[nRow][nCol] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}

