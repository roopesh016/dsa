package ADSA.stack;

import java.util.Stack;

public class EvaluateExpression {

    public static int evalRPN(String[] A) {
        int N = A.length;
        Stack<Integer> evalPrn = new Stack<>();
        int ans = 0;
        for(int i=0; i<N; i++){
            if(A[i]=="+"){
                int a =evalPrn.pop();
                int b =evalPrn.pop();
                ans = a+b;
                evalPrn.push(ans);
            }
            else if(A[i]=="-"){
                int a =evalPrn.pop();
                int b =evalPrn.pop();
                ans = a-b;
                evalPrn.push(ans);
            } else if(A[i]=="*"){
                int a =evalPrn.pop();
                int b =evalPrn.pop();
                ans = a*b;
                evalPrn.push(ans);
            } else if(A[i]=="/"){
                int a =evalPrn.pop();
                int b =evalPrn.pop();
                ans = a/b;
                evalPrn.push(ans);
            }else{
                evalPrn.push(Integer.valueOf(A[i]));
            }
        }
        return evalPrn.pop();
    }

    public static void main(String[] args) {
        String[] A  = {"2", "2", "/"};
        System.out.println(evalRPN(A));
    }
}
