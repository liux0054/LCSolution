package easy.lc401tolc600;

public class LC414 {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int value: nums){
            if(value > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = value;

            }else if(value != firstMax && value > secondMax){
                thirdMax = secondMax;
                secondMax = value;

            }else if(value != firstMax && value != secondMax  && value > thirdMax){
                thirdMax = value;
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return (int)firstMax;
        }
        else {
            return (int)thirdMax;
        }
    }
}
