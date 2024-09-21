package com.company;

public class MiniMaxi {

    public static int fetchMinimuLengthOfMinMaxSubArray(int[] A){

        int n = A.length;
        int ans = n;
        int minValue = Integer.MAX_VALUE;




        //findMinimum value
        for(int i=0; i<n;i++){
            if(A[i]<minValue){
                minValue = A[i];
            }
        }

        int maxValue = Integer.MIN_VALUE;
        //findMaximum value
        for(int i=0;i<n;i++){
            if(A[i]>maxValue){
                maxValue = A[i];
            }
        }


        if(minValue == maxValue){
            ans = 1;
        }

        int mini=-1;
        int maxi=-1;

        //Find the mini length of min and max sub Array
        for(int i=0; i<n; i++){
            if(A[i]==minValue){
                mini = i;
                if(maxi != -1){
                    ans = Math.min(ans,mini-maxi+1);
                }
            }

            if(A[i]==maxValue){
                maxi = i;
                if(mini != -1){
                    ans = Math.min(ans,maxi-mini+1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A={1,6,4,6,5,1,5,2,6,4,4,2,1,2};
        System.out.println(fetchMinimuLengthOfMinMaxSubArray(A));
    }
}
