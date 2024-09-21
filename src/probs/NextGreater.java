package probs;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {
    public static ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> sT = new Stack<>();
        for(int i=0; i<A.size(); i++)
            ans.add(-1);

        for(int i=A.size()-1; i>=0; i--){
            while(sT.size()>0 && sT.peek()<= A.get(i)){
                sT.pop();
            }
            if(sT.size()==0){
                ans.set(i,-1);
                sT.push(A.get(i));
            }
            else{
                ans.set(i,sT.peek());
                sT.push(A.get(i));
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
//        A.add(4);
//        A.add(5);
//        A.add(2);
//        A.add(10);
//
//        A.add(3);
//        A.add(2);
//        A.add(1);

        A.add(39);
        A.add(27);
        A.add(11);
        A.add(4);
        A.add(24);
        A.add(32);
        A.add(32);
        A.add(1);
        System.out.println(nextGreater(A));
    }
}
