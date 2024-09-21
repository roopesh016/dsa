package sorting;

public class CountSort {

    //Count sort will be the range of 0-9;
    public static  int[] countSort(int[] A){
        int n = A.length;
        int[] freq = new int[n];
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
             int val = A[i];
             freq[val]++;
        }

        int x =0;
        for(int i=0; i<n; i++){
            int count = freq[i];
            for(int j=1; j<=count; j++){
                ans[x] = i;
                x++;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
//        int[] A = {9, 1, 3, 8, 3, 2, 6, 5,3,8};
        int[] A = {2,0,2,1,1,0};
        int n =countSort(A).length;
        int B[] = countSort(A);
        for(int i =0; i<n; i++){
            System.out.println(B[i]);
        }
    }
}
