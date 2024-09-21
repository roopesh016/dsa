package com.company;

public class RotateArrayWithB {

    public static int[] solve(int[] A, int B) {

        for(int i=0;i<B;i++){
            int last = A[A.length-1];

            for(int j=A.length-2; j>=0; j--){
                A[j+1] = A[j];
            }
            A[0]=last;
        }
        return A;
    }

    public static int[] reverseLogic(int[] A,int startingPosition,int endPosition){
        int temp =0;
        while(startingPosition<endPosition){
          temp  = A[startingPosition];
          A[startingPosition] = A[endPosition];
          A[endPosition] = temp;
          startingPosition ++;
          endPosition --;
        }
        return A;
    }

    public static int[] solveTwo(int[] A,int B){
        if(B>A.length-1){
            B= B%A.length;
        }
       reverseLogic(A,0,A.length-1);
       reverseLogic(A,0,B-1);
       reverseLogic(A,B,A.length-1);
       return A;
    }
    public static void main(String[] args) {
       int A[] = {10, 20, 30, 40, 50};
       int B = 2;
        int newArr[] = solveTwo(A,B);
        for(int i=0;i<=newArr.length-1;i++){
            System.out.println(newArr[i]);
        }


    }



}
