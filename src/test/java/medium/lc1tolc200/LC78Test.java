package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import medium.lc1tolc200.LC78;

public class LC78Test {
    @Test
    public void testCase1(){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>(Arrays.asList(1)));
        ans.add(new ArrayList<>(Arrays.asList(2)));
        ans.add(new ArrayList<>(Arrays.asList(3)));
        ans.add(new ArrayList<>(Arrays.asList(1,2)));
        ans.add(new ArrayList<>(Arrays.asList(1,3)));
        ans.add(new ArrayList<>(Arrays.asList(2,3)));
        ans.add(new ArrayList<>(Arrays.asList(1,2,3)));
        List<List<Integer>> expAns = new LC78().subsets(new int[]{1,2,3});
        Assert.assertTrue(expAns.containsAll(ans));
        Assert.assertTrue(ans.containsAll(expAns));
    }
}
