package ADSA;

public class SprialMatrixII {


    public static int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        A = A*A;
        int rowIndex =0;
        int colIndex =0;
        int n = ans.length;
        int i =0;
        int j =0;
        int value =0;
        while(n>1 && value<=A){

            for(int k=1; k<=n-1;k++){
                value++;
                ans[rowIndex][colIndex] = value;
                colIndex++;
            }

            for(int k=1; k<=n-1;k++){
                value++;
                ans[rowIndex][colIndex] = value;
                rowIndex++;
            }

            for(int k=1; k<=n-1;k++){
                value++;
                ans[rowIndex][colIndex] = value;
                colIndex--;
            }

            for(int k=1; k<=n-1;k++){
                value++;
                ans[rowIndex][colIndex] = value;
                rowIndex--;
            }
            rowIndex=rowIndex+1; colIndex=colIndex+1; n=n-2;
        }
        if(n==1){
            value++;
            ans[rowIndex][colIndex] = value;
        }


        return ans;
    }


    public static void main(String[] args) {
        int A = 2;
        generateMatrix(A);
    }
}
