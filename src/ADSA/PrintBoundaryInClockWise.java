package ADSA;

public class PrintBoundaryInClockWise {
    //Print Boundary In clock wise direction

    public static int[] solve(int[][] C){
     int n = C.length;
     int m = C[0].length;
     int i =0;
     int j = 0;
     int[] x = new int[n*m];
     int rowIndex =0;

     for(int k =1; k<=n-1; k++){
         x[rowIndex] = C[i][j];
         rowIndex++;
         j++;
     }


     for(int k =1; k<=n-1; k++){
            x[rowIndex] = C[i][j];
            rowIndex++;
            i++;
     }


     for(int k =1; k<=n-1; k++){
            x[rowIndex] = C[i][j];
            rowIndex++;
            j--;
     }


     for(int k =1; k<=n-1; k++){
            x[rowIndex] = C[i][j];
            rowIndex++;
            i--;
     }

     return x;

    }

    public static void main(String[] args) {
        int[][] c = new int[3][3];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[1][0] = 4;
        c[1][1] = 5;
        c[1][2] = 6;
        c[2][0] = 7;
        c[2][1] = 8;
        c[2][2] = 9;
       int[] ans = solve(c);
       for(int i=0; i<ans.length-1; i++){
           System.out.print(ans[i]+",");
       }
    }
}
