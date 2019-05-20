package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import medium.lc1tolc200.LC90;

public class LC90Test {

    @Test
    public void testCase1(){
        List<List<Integer>> expAns = new ArrayList<>();
        expAns.add(new ArrayList<>());
        expAns.add(new ArrayList<>(Arrays.asList(1)));
        expAns.add(new ArrayList<>(Arrays.asList(2)));
        expAns.add(new ArrayList<>(Arrays.asList(1,2)));
        expAns.add(new ArrayList<>(Arrays.asList(2,2)));
        expAns.add(new ArrayList<>(Arrays.asList(1,2,2)));
        List<List<Integer>> ans = new LC90().subsetsWithDup(new int[]{1,2,2});
        Assert.assertTrue(expAns.containsAll(ans));
        Assert.assertTrue(ans.containsAll(expAns));
    }
}
