package ADSA.binarysearch;

import java.util.Arrays;

public class MinimumDiffUsingTwoDArray {

    public static int solve(int A, int B, int[][] C) {
        for(int i=0; i<C.length; i++){              // Sort Matrix Row-Wise
            Arrays.sort(C[i]);
        }

        int ans = Integer.MAX_VALUE;
        for(int row = 0; row < A-1; row++){                                   // loop through 0 to row length-1
            for(int ele = 0; ele < B; ele++){                                 // loop for looping through elements in each row
                int low = 0; int high = B-1;
                int mainEle = C[row][ele];                                    // fix an element in the current row.
                int justGreaterInd = B-1;
                int justSmallerInd = 0;
                while(low <= high){
                    int mid = low + ((high - low)/2);
                    if(C[row+1][mid] ==  mainEle){
                        return 0;
                    }
                    else if(C[row+1][mid] < mainEle){
                        justSmallerInd = mid;                                 // Finding next smaller number
                        low = mid+1;
                    }
                    else{
                        justGreaterInd = mid;                                 // Finding next greater number
                        high = mid-1;

                    }
                }
                ans = Math.min (
                        Math.min(
                                (Math.abs(mainEle - C[row+1][justGreaterInd])) , (Math.abs(mainEle - C[row+1][justSmallerInd]))
                        )
                        , ans);
                if(ans == 0){
                    return 0;
                }

            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int A = 3;
        int B  =2;

        int[][]  X = new int[A][B];
        X[0][0] = 7;
        X[0][1] = 3;
        X[1][0] = 2;
        X[1][1] = 1;
        X[2][0] = 4;
        X[2][1] = 9;

        System.out.println(solve(A,B,X));
    }
}
