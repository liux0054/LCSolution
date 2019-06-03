package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC419;

public class LC419Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC419().countBattleships(
            new char[][]{
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}
            }
        ));
    }
}
