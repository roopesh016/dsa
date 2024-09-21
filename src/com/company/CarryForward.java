package com.company;

public class CarryForward {


    public static int check(int[] A){
        int n = A.length;
        int min = 100000;

        for(int i=0;i<n; i++){
            if(A[i]<min){
                min = A[i];
            }
        }

        System.out.println("The min value:"+min);

        int max = -100000;
        for(int i=0; i<n; i++){
            if(A[i]>max){
                max = A[i];
            }
        }

        System.out.println("The max value:"+max);

        if(min==max){
            return 1;
        }

        //do the carry forward technique
        int mini=-1;
        int maxi=-1;
        int ans = n;
        for(int i =n-1;i>=0;i--)
        {
            if(A[i]==min){
               mini=i;
                if(maxi !=-1){
                    ans = Math.min(ans,maxi-mini+1);
                }
            }


            if(A[i]==max){
               maxi=i;
                if(mini !=-1){
                    ans = Math.min(ans,mini-maxi+1);
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int A[] = {2, 6, 1, 6, 9};
        System.out.println(check(A));
    }
}
