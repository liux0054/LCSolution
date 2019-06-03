package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.MinStack;

public class LC155Test {

    @Test
    public void testCase1(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void testCase2(){
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        Assert.assertEquals(0, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.getMin());
    }
}
