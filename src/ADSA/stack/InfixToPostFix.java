package ADSA.stack;

import java.util.Stack;

public class InfixToPostFix {

    public static String solve(String A) {

        Stack<Character> s1 = new Stack<>();
        int N = A.length();
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<N; i++){
            if(Character.isLetter(A.charAt(i))){
                ans.append(A.charAt(i));
            }else if((A.charAt(i)=='^')||(A.charAt(i)=='/') ||(A.charAt(i)=='*')||(A.charAt(i)=='+') ||(A.charAt(i)=='-')){
//                if(){
//
//                }else{
//
//                }
            } else if(A.charAt('i')=='('){
               s1.push(A.charAt(i));
            } else{
                while (!s1.isEmpty() && s1.peek() != '(') {
                    char operator = s1.pop();
                    s1.push(operator);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String A = "x^y/(a*z)+b";
        System.out.println(solve(A));
    }
}
