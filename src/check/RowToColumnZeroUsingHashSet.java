package check;

import java.util.HashSet;
import java.util.Iterator;

public class RowToColumnZeroUsingHashSet {

    public static int[][] solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        HashSet<Integer> hSRow = new HashSet<>();
        HashSet<Integer> hSCol = new HashSet<>();

        //Iterate over the array where ever we find the zero update the hSRow with row values which to make zero
        //and col values which to make zero

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j]==0){
                    hSRow.add(i);
                    hSCol.add(j);
                }
            }
        }


        //Now we have to user iterator to update the row and column index values as zeros

        Iterator<Integer> itrRow= hSRow.iterator();
        while(itrRow.hasNext()){
            int rowValue = itrRow.next();

            for(int col=0; col<m; col++){
                A[rowValue][col] = 0;
            }
        }

        Iterator<Integer> itrCol= hSCol.iterator();
        while(itrCol.hasNext()){
            int colValue = itrCol.next();

            for(int row=0; row<n; row++){
                A[row][colValue] = 0;
            }
        }

        return A;
    }

    public static void main(String[] args) {
       int[][] A= new int[3][4];
       A[0][0] = 1;
       A[0][1] = 2;
       A[0][2] = 3;
       A[0][3] = 4;
       A[1][0] = 5;
       A[1][1] = 6;
       A[1][2] = 7;
       A[1][3] = 0;
       A[2][0] = 9;
       A[2][1] = 2;
       A[2][2] = 0;
       A[2][3] = 4;

//        solve(A);
        System.out.println(converToString(51));
    }



    public static String converToString(int n){

        String ans ="";
        StringBuilder sb = new StringBuilder();

        if(n == 0){
            sb.insert(0,"0");
        } else {
            while (n>0){
                sb.insert(0, (char) ('0' + (n % 10)));
                n /= 10;
            }
        }
        return sb.toString();
    }
}
