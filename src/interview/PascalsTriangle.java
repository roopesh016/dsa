package interview;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

   public static int[][] pascalTriangle(int N){
       int[][] X = new int[N][N];

       X[0][0] = 1;
       for(int i=1; i<N; i++){
           X[i][0] = 1;
           X[0][i] = 1;
           for(int j=1;j<i; j++){
               X[i][j] = X[i-1][j-1]+X[i-1][j];
           }
       }
       return X;
   }


   public static ArrayList<ArrayList<Integer>> pascalsTriangle(int N){
       ArrayList<ArrayList<Integer>> X = new ArrayList<>();
       if(N == 0){
           return X;
       }

       if(N==1){
           ArrayList<Integer> Y = new ArrayList<>();
           Y.add(1);
           X.add(Y);
           return X;
       }
       X.add(new ArrayList<>());
       X.get(0).add(1);// X[0][0] = 1
       // Fill in the rest of Pascal's Triangle
       for (int i = 1; i < N; i++) {
           ArrayList<Integer> row = new ArrayList<>();
           row.add(1);// to add the new row X[i][0]  X[0][i]
             for(int j=1; j<i ; j++){
                 int value = X.get(i-1).get(j-1)+X.get(i-1).get(j);
                 row.add(value);
             }
           row.add(1);
           X.add(row);
       }
       return X;
   }

    public static void main(String[] args) {
        pascalsTriangle(5);
    }
}
