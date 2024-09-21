package ADSA.stack;

import java.util.Stack;

public class BalancedParanthesis {


    public static int solve(String A) {
        Stack<Character> st = new Stack<>();

        char[] c = A.toCharArray();

        for(int i=0; i<c.length; i++){
            if(c[i]=='['||c[i]=='{'||c[i]=='(' ){
                st.push(c[i]);
            }else if(c[i]==']'){
                if(st.size()!=0 && st.peek()=='[')
                    st.pop();
                else
                    return 0;
            } else if(c[i]=='}'){
                if(st.size()!=0 && st.peek()=='{')
                    st.pop();
                else
                    return 0;
            } else if(c[i]==')'){
                if(st.size()!=0 && st.peek()=='(')
                    st.pop();
                else
                    return 0;

            }
        }
        if(st.size()==0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve("(){"));
    }
}
