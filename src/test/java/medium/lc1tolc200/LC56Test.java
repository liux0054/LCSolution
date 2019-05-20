package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

public class LC56Test {

    @Test
    public void testCase1(){
        //Input: [[1,3],[2,6],[8,10],[15,18]]
        //Output: [[1,6],[8,10],[15,18]]

        Assert.assertArrayEquals(new int[][]{
            {1,6},
            {8,10},
            {15,18}
        }, new LC56().merge(new int[][]{
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        }));
    }


    @Test
    public void testCase2(){
        //Input: [[1,3],[2,6],[8,10],[15,18]]
        //Output: [[1,6],[8,10],[15,18]]

        Assert.assertArrayEquals(new int[][]{
            {1,5}
        }, new LC56().merge(new int[][]{
            {1,4},
            {4,5}
        }));
    }
}
