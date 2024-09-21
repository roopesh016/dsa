package ADSA;

public class SpiralMatrix {

    public static int[] solve(int[][] c){
        int i=0;
        int j=0;
        int n=c.length;
        int m=c[0].length;
        int[] ans = new int[n*m];
        int rowIndex =0;
        while (n>1){

            for(int k=1; k<=n-1;k++){
                ans[rowIndex] = c[i][j];
                rowIndex++;
                j++;
            }

            for(int k=1; k<=n-1;k++){
                ans[rowIndex] = c[i][j];
                rowIndex++;
                i++;
            }

            for(int k=1; k<=n-1;k++){
                ans[rowIndex] = c[i][j];
                rowIndex++;
                j--;
            }

            for(int k=1; k<=n-1;k++){
                ans[rowIndex] = c[i][j];
                rowIndex++;
                i--;
            }

            i=i+1; j=j+1; n=n-2;
        }
        if(n==1)
            ans[rowIndex] = c[i][j];

        return ans;
    }


    public static void main(String[] args) {
        int[][] c = new int[5][5];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[0][3] = 4;
        c[0][4] = 5;

        c[1][0] = 16;
        c[1][1] = 17;
        c[1][2] = 18;
        c[1][3] = 19;
        c[1][4] = 6;

        c[2][0] = 15;
        c[2][1] = 24;
        c[2][2] = 25;
        c[2][3] = 20;
        c[2][4] = 7;


        c[3][0] = 14;
        c[3][1] = 23;
        c[3][2] = 22;
        c[3][3] = 21;
        c[3][4] = 8;


        c[4][0] = 13;
        c[4][1] = 12;
        c[4][2] = 11;
        c[4][3] = 10;
        c[4][4] = 9;

        int[] x = solve(c);

        for(int i=0; i<=x.length-1; i++){
            System.out.print(x[i] +" ");
        }
    }

}
