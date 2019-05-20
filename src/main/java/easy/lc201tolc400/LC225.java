package easy.lc201tolc400;

import java.util.LinkedList;
import java.util.Queue;

public class LC225 {

}

class MyStack{

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private boolean primaryQ1;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        primaryQ1 = true;
    }

    /** Push element x onto stack. */
    public void push(int x) {
       if(primaryQ1){
           queue2.add(x);
           while(!queue1.isEmpty()){
               queue2.add(queue1.remove());
           }
           primaryQ1 = !primaryQ1;
       }else {
           queue1.add(x);
           while(!queue2.isEmpty()){
               queue1.add(queue2.remove());
           }
           primaryQ1 = !primaryQ1;
       }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(primaryQ1){
            return queue1.remove();
        }else{
            return queue2.remove();
        }
    }

    /** Get the top element. */
    public int top() {
       if(primaryQ1){
           return queue1.peek();
       }else {
           return queue2.peek();
       }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
       if(primaryQ1){
           return queue1.isEmpty();
       }else{
           return queue2.isEmpty();
       }
    }
}
