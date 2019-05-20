package medium.lc1tolc200;

import java.util.List;

import org.junit.Test;

import medium.lc1tolc200.LC54;

public class LC54Test {

    @Test
    public void testCase1(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1,2,3}, {4,5,6}, {7,8,9}
        });

        System.out.println("test");
    }


    @Test
    public void testCase2(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
        });

        System.out.println("test");
    }


    @Test
    public void testCase3(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1}
        });

        System.out.println("test");
    }

    @Test
    public void testCase4(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1,2,3}
        });

        System.out.println("test");
    }

    @Test
    public void testCase5(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1},{2}
        });

        System.out.println("test");
    }


    @Test
    public void testCase6(){
        List<Integer> answer = new LC54().spiralOrder(new int[][]{
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        });

        System.out.println("test");
    }

}
