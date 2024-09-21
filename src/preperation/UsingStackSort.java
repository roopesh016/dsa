package preperation;

import java.util.ArrayList;
import java.util.Stack;

public class UsingStackSort {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> B = new Stack<>();
        for(int i=0; i<A.size(); i++){
            B.push(A.get(i));
        }

        //5, 17, 100, 11
        //5,4,3,2,1
        Stack<Integer> temporaryStack = new Stack<>();
        temporaryStack.push(B.pop());
        while(!B.isEmpty()){
           int x = B.pop();
           if(!temporaryStack.isEmpty() && x >= temporaryStack.peek()) {
               temporaryStack.push(x);
           }else {
               while(!temporaryStack.isEmpty() && temporaryStack.peek() > x){
                   B.push(temporaryStack.pop());
               }
               temporaryStack.push(x);
           }
        }


        for(int j=A.size()-1; j>=0; j--){
            A.set(j,temporaryStack.pop());
        }

        return A;
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);

        System.out.println(solve(A));
    }
}
