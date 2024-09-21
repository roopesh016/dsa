package com.company;

import java.util.ArrayList;
import java.util.List;

public class TimeToEquality {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {




//        for(int i=0;i<=A.length-1; i++){
//
//            for(int j=i+1; j<=A.length-1; j++){
//                if(A[i]<=A[j]){
//                    break;
//                }
//                if(j==A.length-1){
//                    X[count++] = A[i];
//                }
//            }
//
//        }
        ArrayList<Integer> leaderElements = new ArrayList<>();
        int max_from_right =  A.get(A.size()-1);
        leaderElements.add(max_from_right);
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");

        for (int i = A.size()-2; i >= 0; i--)
        {
            if (max_from_right < A.get(i))
            {
                max_from_right = A.get(i);
                leaderElements.add(max_from_right);
//                System.out.print(max_from_right + " ");
            }
        }

        return leaderElements;
    }


    public static void main(String[] args) {
//        int[] A= {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> X = new ArrayList<>();
        X.add(16);
        X.add(17);
        X.add(4);
        X.add(3);
        X.add(5);
        X.add(2);

        ArrayList<Integer> expected = solve(X);

        for(int i=0;i<=expected.size()-1; i++){
            System.out.println(expected.get(i));
        }


    }
}
