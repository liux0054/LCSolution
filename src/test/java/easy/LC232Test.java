package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC232Test {

    @Test
    public void testCase1(){
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Assert.assertEquals(1, myQueue.peek());
        Assert.assertEquals(1, myQueue.pop());
        Assert.assertFalse(myQueue.empty());
    }


    @Test
    public void testCase2(){
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        Assert.assertEquals(1, myQueue.peek());
    }

    @Test
    public void testCase3(){
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        Assert.assertEquals(1, myQueue.pop());
        Assert.assertEquals(2, myQueue.pop());
        Assert.assertEquals(3, myQueue.pop());
        Assert.assertTrue(myQueue.empty());
    }
}
