package ADSA.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
       stack.push(x);
       if(minStack.isEmpty()|| minStack.peek()<=x){
           minStack.push(x);
       }
    }

    public void pop() {
       if(stack.isEmpty())
           return;
       stack.pop();
    }

    public int top() {
       if(stack.isEmpty())
           return -1;
      return stack.peek();
    }

    public int getMin() {
       if(minStack.isEmpty())
           return -1;
       return minStack.peek();
    }

    public static void main(String[] args) {

    }
}
