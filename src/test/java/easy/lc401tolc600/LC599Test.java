package easy.lc401tolc600;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import easy.lc401tolc600.LC599;

public class LC599Test {
    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new String[]{"Shogun"}, new LC599().findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new String[]{"Shogun"}, new LC599().findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"KFC", "Shogun", "Burger King"}));
    }

    @Test
    public void testCase3(){
        String[] expected = new String[]{"Shogun", "Tapioca Express"};
        Arrays.sort(expected);
        String[] actual =  new LC599().findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"Tapioca Express", "Shogun", "Burger King"});
        Arrays.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

}
