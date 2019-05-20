package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.lc801tolc1000.LC986;

public class LC986Test {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[][]{ {1,2}, {5,5}, {8,10}, {15,23}, {24,24}, {25,25}},
            new LC986().intervalIntersection(new int[][]{ {0,2}, {5,10}, {13,23}, {24,25} }, new int[][]{
                                             {1,5},{8,12},{15,24},{25,26} }
                                             )
        );
    }


    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[][]{},
            new LC986().intervalIntersection(new int[][]{ {0,2}, {5,10}, {13,23}, {24,25} }, new int[][]{})
        );
    }
}
