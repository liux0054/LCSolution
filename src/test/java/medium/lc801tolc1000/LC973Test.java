package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.lc801tolc1000.LC973;

public class LC973Test {
    @Test
    public void testCase1(){

        int[][] expected = new int[][]{{-2, 2}};
        Assert.assertArrayEquals(expected, new LC973().kClosest(new int[][]{{1,3}, {-2, 2}}, 1));
    }

    @Test
    public void testCase2(){

        int[][] expected = new int[][]{{-2, 2}};
        Assert.assertArrayEquals(expected, new LC973().kClosest(new int[][]{{3,3}, {5, -1}, {-2, 4}}, 2));
    }


}
