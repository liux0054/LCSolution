package easy;

public class LC628 {
    public int maximumProduct(int[] nums) {
       int product[][][] = new int[nums.length][4][2];
       int zeroInFront = 0;
       int oneInFront = 1;
       int twoInFront = 2;
       int threeInFront = 3;
       int ignoreMe = 0;
       int countMe = 1;

       product[0][zeroInFront][countMe] = nums[0];

       for(int i=1; i<nums.length; i++){

       }
    }
}
