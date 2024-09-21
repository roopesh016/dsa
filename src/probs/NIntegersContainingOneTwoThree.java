package probs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NIntegersContainingOneTwoThree {
    //Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.
    //
    //NOTE: All the A integers will fit in 32-bit integers.

    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        if(A==0){
            ans.add(0);
            return ans;
        }
        Queue<String> qS = new LinkedList<>();
        qS.add("1");
        qS.add("2");
        qS.add("3");

        if(A==1){
            ans.add(Integer.parseInt(qS.remove()));
        }else if(A==2|| A==3){
            for(int i=0;i<A;i++){
                ans.add(Integer.parseInt(qS.remove()));
            }
        }else{
            String front ="";
            while(count<=A){
                front = qS.remove();
                ans.add(Integer.parseInt(front));
                qS.add(front+'1');
                qS.add(front+'2');
                qS.add(front+'3');
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A = 1;
        System.out.println(solve(A));
    }
}
