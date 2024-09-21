package check;

import java.util.Stack;

public class StackCheck {

    public static void check(String s){
        Stack<Character> sT = new Stack();
        int n = s.length();
        char[] c = s.toCharArray();
        int count =0;
        int popCount =0;
         for(int i=0;i<n;i++){
            if(c[i]=='('){
                sT.push(c[i]);
                count++;
            } else if(c[i]==')'){
                sT.pop();
                popCount++;
            }
            if(popCount == count){
                System.out.println("the given string is balanced");
            }
        }
    }


    public static void main(String[] args) {
        check("((()))()()");
    }
}
