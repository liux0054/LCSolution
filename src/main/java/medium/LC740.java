package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LC740 {
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        TreeMap<Integer, Integer> pointIfDeleteKey = new TreeMap<>();
        for (int num : nums) {
            if (!pointIfDeleteKey.containsKey(num)) {
                pointIfDeleteKey.put(num, num);
            } else {
                pointIfDeleteKey.put(num, pointIfDeleteKey.get(num) + num);
            }
        }

        List<Integer> pointIfDeleteKeyList = new ArrayList<>(pointIfDeleteKey.values());
        List<Integer> keys = new ArrayList<>(pointIfDeleteKey.keySet());
        int[][] pointCount = new int[20000][2];
        pointCount[0][0] = 0;
        pointCount[0][1] = pointIfDeleteKeyList.get(0);
        for (int i=1; i<pointIfDeleteKeyList.size(); i++) {
            pointCount[i][0] = Math.max(pointCount[i-1][0], pointCount[i-1][1]);
            if (keys.get(i) - keys.get(i-1) == 1) {
                pointCount[i][1] = pointCount[i-1][0] + pointIfDeleteKeyList.get(i);
            } else {
                pointCount[i][1] = Math.max(pointCount[i-1][0], pointCount[i-1][1]) + pointIfDeleteKeyList.get(i);
            }
        }
        return Math.max(pointCount[keys.size()-1][0], pointCount[keys.size()-1][1]);
    }
}
