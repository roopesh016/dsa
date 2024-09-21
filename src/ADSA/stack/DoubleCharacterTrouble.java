package ADSA.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();;

        Stack<Character> s = new Stack<>();
        int N = A.length();

        for(int i=0; i<N ; i++){
            if(!s.empty() && s.peek()==A.charAt(i)){
                s.pop();
            }else {
                s.push(A.charAt(i));
            }
        }
        while (s.empty() == false){
            sb.append(s.pop());
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
      String s = "aa";
        System.out.println(solve(s));
    }
}
