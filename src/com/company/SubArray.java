package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubArray {

    public static void main(String[] args) {
//        int[] A = {4,-1,1};
//        int[] A = {1,2,3,4,5};
//        int result = check(A);
//        System.out.println(result);
//        solveFour(2);
//        int arr[] = {510827,351151,96897,925335,299818,192489,456948,44720,510589,598577};
//        System.out.println(solve(arr,808099));
//        ArrayList<Integer> A = new ArrayList<>();
//        A.add(6);
//        A.add(7);
//        A.add(10);
//        A.add(3);
//        A.add(10);
//        A.add(10);
//        A.add(3);
//        A.add(10);
        int arr[] = {6,7,10,3,10,10,3,10};
        int newArr[] = check(arr,0,4);
        for(int i=0;i<=newArr.length-1;i++){
            System.out.println(newArr[i]);
        }

//        System.out.println(solve(A,0,4));

//       expected:  [10 3 10 7 6 10 3 10 ]


//        A.add(4);
//        System.out.println(solve(A,0,4));
    }

//    public static int findSubarrayWithSum(int[] A) {
//        int sum = 0;
//        boolean foundZeroSumSubarray = false;
//        Set<Integer> seenSums = new HashSet<>();
//        for (int i = 0; i < A.length; i++) {
//            sum += A[i];
//
//            if (sum == 0|| seenSums.contains(sum)) {
//                foundZeroSumSubarray = true;
//                break;
//            }
//            seenSums.add(sum);
//        }
//
//        int value =0;
//        if(foundZeroSumSubarray){
//          return value = 1;
//        }
//        return value;
//
////        return foundZeroSumSubarray ? 1 : 0;
//
//    }


    public static int check(int[] A){
        boolean foundZeroSumSubarray = false;

        for (int i = 0; i < A.length; i++) {
            int sum = A[i];
            if (sum == 0)
                foundZeroSumSubarray = true;
            for (int j = i + 1; j < A.length; j++) {
                sum += A[j];
                if (sum == 0)
                    foundZeroSumSubarray = true;
            }
        }

        int value =0;
        if(foundZeroSumSubarray){
            return value = 1;
        }
        return value;
    }

    public static void solve(int N){
        for(int i=0; i<Math.pow(2,N);i++){
            int j =i;
            while(j > 0){
                j-= 1;
                System.out.println("The i value:"+i +" , "+j);
            }

        }


    }


    public static void solveTwo(int N){
        for(int i=0; i<N;i++){
          for(int j=i-1; j>=0; j++){
              System.out.println("Iteration of: "+i+" ,"+j);
          }

        }


    }


    public static int solve(int[] A, int B) {
        int value =0;
        for(int i=0;i<=A.length-1;i++) {

            for(int j=i+1;j<=A.length-1;j++){

                if(A[i]+A[j]==B){
                    value = 1;
                } else{
                    value = 0;
                }
            }
        }
        return value;
    }


    public static int[] check(int[] A, int B, int C){
        int temp =0;
        while(B<C){
            temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int temp = 0;
        while(B < C){
            temp = A.get(B);
            A.set(B,A.get(C));
            A.set(C,temp);
        }
        return A;
    }


    public static void solveThree(int N){
        int sum =0;
        for(int i=0; i<=N;i++){
            for(int j=i; j<=N && j>i ; j++){
                System.out.println("Iteration of: "+i+" ,"+j);
            }

        }


    }

    public static void solveFour(int N){
        int sum =0;
        for(int i=0; i< N;i++){
            for(int j= N; j>i ; j--){
                System.out.println("Iteration of: "+i+" ,"+j);
            }

        }


    }


    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        String s1="";
        for(int i=ch.length-1; i>=0; i--){
            s1+= ch[i];
        }

        if(s.equalsIgnoreCase(s1.trim())){
            return true;
        } else {
            return false;
        }
    }

}
