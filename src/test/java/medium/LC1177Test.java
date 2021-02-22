package medium;

import org.junit.Test;

public class LC1177Test {
    @Test
    public void testCase1() {
        System.out.println(new LC1177().canMakePaliQueries("abcda",
                new int[][] {{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}}));
    }
}
