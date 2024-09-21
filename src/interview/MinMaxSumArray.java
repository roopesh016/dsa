package interview;

public class MinMaxSumArray {

    //A = [-2, 1, -4, 5, 3]


    public int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            max= Math.max(A[i],max);
        }
        return max;
    }

    public int findMin(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            min= Math.min(A[i],min);
        }
        return min;
    }

    public int solve(int[] A) {
        int ans = findMax(A) + findMin(A);
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-2,1,-4,5,3};
        MinMaxSumArray minMaxSumArray = new MinMaxSumArray();
        System.out.println(minMaxSumArray.solve(A));
    }
}
