package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import medium.LC120;

public class LC120Test {

    @Test
    public void testCase1(){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        Assert.assertEquals(11, new LC120().minimumTotal(triangle));
    }

    @Test
    public void testCase2(){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(3, 2));
        triangle.add(Arrays.asList(1, -2, -1));


        Assert.assertEquals(-1, new LC120().minimumTotal(triangle));
    }
}
