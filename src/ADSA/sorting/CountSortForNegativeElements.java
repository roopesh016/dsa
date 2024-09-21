package ADSA.sorting;

public class CountSortForNegativeElements {

    public static int[] check(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int N = A.length;

        for (int i = 0; i < N; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }

        int[] frq = new int[max - min + 1];

        for (int i = 0; i < N; i++) {
            int value = A[i];
            frq[value+Math.abs(min)]++;
        }
        int[] ans = new int[N];
        int index =0;
        for(int i=min; i<=max; i++){
            int count = frq[i+Math.abs(min)];
            for(int j=1; j<=count; j++){
                ans[index] = i;
                index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-3, 2, 2, 1, -4, 5, -3};
        int[] expected = check(A);
        for(int i=0; i<expected.length; i++){
            System.out.println(expected[i]);
        }
    }
}
