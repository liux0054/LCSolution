package easy.lc1tolc200;

import java.util.Stack;

public class LC155 {



}

class MinStack{
    /** initialize your data structure here. */
    private int min;
    Stack<Integer> stack;

    public MinStack() {
       min = Integer.MAX_VALUE;
       stack = new Stack<>();
    }

    public void push(int x) {
       if(x <= min){
           stack.push(min);
           stack.push(x);
           min = x;
       }else{
           stack.push(x);
       }
    }

    public void pop() {
        if(stack.pop() == min){
           min = stack.pop();
        }
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
       return min;
    }
}