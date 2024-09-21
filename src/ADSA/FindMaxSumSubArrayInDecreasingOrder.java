package ADSA;

public class FindMaxSumSubArrayInDecreasingOrder {

    public static int solve(int[] A) {

        int n = A.length;
        int max =0;
        // for(int i=0; i<n ;i++){

        //     if(A[i]>A[i+1]){
        //         i++;
        //     }
        //     sum +=A[i];

        //     if(sum<0){
        //         sum =0;
        //     }

        //     if(sum>max){
        //         max = sum;
        //     }
        // }

        int i =1;
        int sum = A[0];
        while(i<n){
            if(A[i-1]>A[i] ){
                sum +=A[i];
                if(sum<0){
                    sum =0;
                }

                if(sum>max){
                    max = sum;
                }

                i++;
            }else{
                sum =A[i];
                if(sum>max){
                    max = sum;
                }
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] A ={7,1,4,3,7,10};
        solve(A);
    }
}
