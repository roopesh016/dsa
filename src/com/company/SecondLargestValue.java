package com.company;

public class SecondLargestValue {

    public static int solve(int[] A) {

        boolean allEqual = true;


        int max = -100000;
        for(int i=0;i<=A.length-1; i++){
            if(A[i]>max){
                max = A[i];
                allEqual = false;
            }
        }

        int secondMax = -100000;
        for(int i=0;i<=A.length-1; i++){
            if(A[i]>secondMax && A[i]<max) {
                secondMax = A[i];
                allEqual = false;
            }
        }

        if(allEqual==true){
            return -1;
        }else{
            return secondMax;
        }
    }



    public static int solveTwo(int[] A){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                secondMax = max;
                max = A[i];
            } else if (A[i] > secondMax && A[i] != max) {
                secondMax = A[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondMax;
        }
    }


    public static int solveThirdMax(int [] A){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thridMax = Integer.MIN_VALUE;

        for(int i=0; i<=A.length-1; i++){
            if(A[i]>max){
                secondMax = max;
                max = A[i];
            } else if(A[i]>secondMax && A[i]!=max){
                secondMax= A[i];
            } else if(A[i]>thridMax && A[i]!=secondMax){
                thridMax = A[i];
            }
        }

        if (thridMax == Integer.MIN_VALUE) {
            return -1;
        } else {
            return thridMax;
        }

    }


    public static void main(String[] args) {
        int[] a ={1,8,2,9,2,1};
        System.out.println(solveThirdMax(a));
    }
}
