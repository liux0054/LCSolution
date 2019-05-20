package medium.lc201tolc400;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import medium.lc201tolc400.LC347;

public class LC347Test {

    @Test
    public void testCase1(){
        List<Integer> exected = Arrays.asList(1,2);
        List<Integer> actual = new LC347().topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        Assert.assertTrue(exected.containsAll(actual));
        Assert.assertTrue(actual.containsAll(exected));
    }

}

