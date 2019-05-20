package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.lc201tolc400.MyStack;

public class LC225Test {

    @Test
    public void testCase1(){
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
        Assert.assertEquals(2, stack.pop());
        Assert.assertFalse(stack.empty());
    }
}
