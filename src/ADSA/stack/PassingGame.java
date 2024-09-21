package ADSA.stack;

import java.util.Stack;

public class PassingGame {

    public static int solve(int A, int B, int[] C) {
        Stack<Integer> passingBall = new Stack<>();
        passingBall.push(B);
        for(int i=0; i<A; i++) {
            if(C[i]==0){
               passingBall.pop();
            }else{
                passingBall.push(C[i]);
            }
        }
        return passingBall.peek();
    }

    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int[] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        System.out.println(solve(A,B,C));
    }
}
