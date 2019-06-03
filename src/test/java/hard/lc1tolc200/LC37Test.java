package hard.lc1tolc200;

import org.junit.Test;

import hard.LC37;

public class LC37Test {

    @Test
    public void testCase1(){
        char[][] ans = new char[][]{
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},

            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},

            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},

            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},

            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},

            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},

            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        new LC37().solveSudoku(ans);
        System.out.println("test");
    }
}
