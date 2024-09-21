package preperation;

import java.util.PriorityQueue;

public class TwoDKthSmallestNumber {

    //This can be solved using heaps
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                pQ.add(matrix[i][j]);
            }
        }

        for(int i=0; i<k; i++){
            pQ.poll();
        }

        return pQ.peek();

    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 5;
        matrix[0][2] = 9;

        matrix[1][0] = 10;
        matrix[1][1] = 11;
        matrix[1][2] = 13;

        matrix[2][0] = 12;
        matrix[2][1] = 13;
        matrix[2][2] = 15;

        System.out.println(kthSmallest(matrix,8));
    }
}
