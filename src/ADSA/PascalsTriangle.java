package ADSA;

public class PascalsTriangle {


    public static int[][] pascalTriangle(int N){
        int[][] c= new int[N][N];
        if(N==0)
            return c;

            c[0][0] = 1;
            for(int i=1 ; i<N ; i++){
                c[i][0] = 1;
                c[i][i] = 1;
                System.out.print(c[i][0]);
                for(int j = 1 ; j<i ; j++){
                    c[i][j] = c[i-1][j-1] + c[i-1][j];
                    System.out.print(c[i][j]);
                }
                System.out.println(c[i][i]);
            }
        return c;
    }

    public static void main(String[] args) {
        int A = 0;
        int[][]x = pascalTriangle(A);
        for(int i = 0; i<x.length; i++){
            for(int j = 0 ; j<x[0].length ; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
