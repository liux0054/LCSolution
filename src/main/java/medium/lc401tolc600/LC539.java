package medium.lc401tolc600;

import java.util.Arrays;
import java.util.List;

public class LC539 {
    public int findMinDifference(List<String> timePoints) {
        int[] timeInInt = new int[timePoints.size()];
        for(int i=0; i<timePoints.size(); i++){
            String[] hourMinute = timePoints.get(i).split(":");
            int hour = Integer.parseInt(hourMinute[0].trim());
            int minute = Integer.parseInt(hourMinute[1].trim());
            timeInInt[i] = hour * 60 + minute;
        }

        Arrays.sort(timeInInt);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<timeInInt.length-1; i++){
            minDiff = Math.min(minDiff, timeInInt[i+1] - timeInInt[i]);
        }
        minDiff = Math.min(minDiff, timeInInt[0] + 24 * 60 - timeInInt[timeInInt.length-1]);
        return minDiff;
    }
}
