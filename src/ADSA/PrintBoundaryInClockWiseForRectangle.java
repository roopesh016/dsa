package ADSA;

public class PrintBoundaryInClockWiseForRectangle {

    public static int[] solve(int[][] C){
        int i =0;
        int j =0;
        int n = C.length;
        int m = C[0].length;
        int[] ans = new int[n*m];
        int rowIndex = 0;

        for(int k=1; k<=m-1; k++){
            ans[rowIndex] = C[i][j];
            rowIndex++;
            j++;
        }

        for(int k=1; k<=n-1; k++){
            ans[rowIndex] = C[i][j];
            rowIndex++;
            i++;
        }

        for(int k=1;k<=m-1; k++){
            ans[rowIndex] = C[i][j];
            rowIndex++;
            j--;
        }

        for(int k=1;k<=n-1; k++){
            ans[rowIndex] = C[i][j];
            rowIndex++;
            i--;
        }

        return ans;
    }


    public static void main(String[] args) {
        int[][] c = new int[3][6];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[0][3] = 4;
        c[0][4] = 5;
        c[0][5] = 6;
        c[1][0] = 14;
        c[1][1] = 15;
        c[1][2] = 16;
        c[1][3] = 17;
        c[1][4] = 18;
        c[1][5] = 7;
        c[2][0] = 13;
        c[2][1] = 12;
        c[2][2] = 11;
        c[2][3] = 10;
        c[2][4] = 9;
        c[2][5] = 8;

        int[] x = solve(c);

        for(int i=0; i<x.length-1; i++){
            System.out.print(x[i] +" ");
        }
    }
}
