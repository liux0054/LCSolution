package medium;

public class LC75 {
    public void sortColors(int[] nums) {
        int numberOfZero = 0;
        int numberOfOne = 0;
        int numberOfTwo = 0;
        for (int num : nums) {
            if (num == 0) {
                numberOfZero++;
            } else if (num ==  1) {
                numberOfOne++;
            } else if (num == 2) {
                numberOfTwo++;
            }
        }
        
        for(int i=0; i<numberOfZero; i++) {
            nums[i] = 0;
        }
        for (int i=numberOfZero; i<numberOfZero+numberOfOne; i++) {
            nums[i] = 1;
        }
        for (int i=numberOfZero + numberOfOne; i<numberOfZero + numberOfOne + numberOfTwo; i++) {
            nums[i] = 2;
        }
    }
}
