package easy.lc601tolc800;

public class LC643 {

    public double findMaxAverage(int[] nums, int k) {
        double[] averages = new double[nums.length];

        averages[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            averages[i] = (averages[i-1] * i + nums[i])/(i+1);
        }

        double max = -10000;
        for(int i=0; i<nums.length-k+1; i++){
            int begin = i;
            int end = i + k -1;
            if(begin >= 1){
                max = Math.max(max, ((end+1) * averages[end] - (begin) * averages[begin-1])/(end - begin +1));
            }else{
                max = Math.max(max, ((end+1) * averages[end])/(end - begin +1));
            }
        }
        return max;
    }
}
