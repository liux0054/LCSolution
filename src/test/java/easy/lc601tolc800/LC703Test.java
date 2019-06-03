package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.KthLargest;

public class LC703Test {

    @Test
    public void testCase1(){
        int[] arr = new int[]{4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);
        Assert.assertEquals(4, kthLargest.add(3));   // returns 4
        Assert.assertEquals(5, kthLargest.add(5));   // returns 5
        Assert.assertEquals(5, kthLargest.add(10));  // returns 5
        Assert.assertEquals(8, kthLargest.add(9));   // returns 8
        Assert.assertEquals(8, kthLargest.add(4));   // returns 8
    }
}
