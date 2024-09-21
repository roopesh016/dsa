package ADSA.stack;

import java.util.Arrays;
import java.util.Stack;

public class TwoBracketExpression {

    public static int solve(String A, String B) {
        return Arrays.equals(getOperators(A), getOperators(B)) ? 1 : 0;
    }

    private static char[] getOperators(String A) {
        char[] arr = new char[26];
        char currOperator = '+';
        Stack<Character> stack = new Stack<>();
        stack.push('+');
        for (char c : A.toCharArray()) {
            if (c == '+' || c == '-') {
                currOperator = c == stack.peek() ? '+' : '-';
            } else if (c == '(') {
                stack.push(currOperator);
            } else if (c == ')') {
                stack.pop();
            } else {
                arr[c - 'a'] = currOperator;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String A = "-(a+b+c)";
        String B = "-a-b-c";
        System.out.println(solve(A,B));
    }
}
