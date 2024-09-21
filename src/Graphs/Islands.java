package Graphs;

import java.util.ArrayList;

public class Islands {

    public int solve(int[][] A) {
        int ans = 0;

        for(int i =0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                int x= A[i][j];
                if(x ==1) {
                    doSomething(i,j,A);
                    ans++;
                }
            }
        }
        return ans;
    }


    public void doSomething(int i, int j,int[][] A){
        if(i<0||i>=A.length || j<0|| j>=A[0].length || A[i][j]==0 || A[i][j]==2)
            return;
        A[i][j] = 2;
        doSomething(i-1,j,A);
        doSomething(i,j-1,A);
        doSomething(i+1,j,A);
        doSomething(i,j+1,A);
        doSomething(i-1,j-1,A);
        doSomething(i+1,j+1,A);
        doSomething(i-1,j+1,A);
        doSomething(i+1,j-1,A);
    }


    public static void main(String[] args) {
        Islands is  = new Islands();
        int[][] A= {
                {1,1,0,0,0},
                {0,1,0,0,0},
                {1,0,0,1,1},
                {0,0,0,0,0},
                {1,0,1,0,1}
        };

        System.out.println(is.solve(A));
    }
}
