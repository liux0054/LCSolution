package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import easy.LC970;

public class LC970Test {

    @Test
    public void testCase1(){

        List<Integer> actual = new LC970().powerfulIntegers(2, 3, 10);
        Collections.sort(actual);
        List<Integer> expected = Arrays.asList(2,3,4,5,7,9,10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2(){
        List<Integer> actual = new LC970().powerfulIntegers(3, 5, 15);
        List<Integer> expected = Arrays.asList(2,4,6,8,10,14);
        Assert.assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }
}
