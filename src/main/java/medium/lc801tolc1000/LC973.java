package medium.lc801tolc1000;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC973 {
    public int[][] kClosest(int[][] points, int K) {
        int[] distance = new int[points.length];
        for(int i=0; i<points.length; i++){
            distance[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }

        Arrays.sort(distance);
        List<int[]> ans = new ArrayList<>();
        K--;

        for(int i=0; i<points.length; i++){
            if(points[i][0] * points[i][0] + points[i][1] * points[i][1] <= distance[K]){
                ans.add(new int[]{points[i][0], points[i][1]});
            }
        }

        return ans.toArray(new int[0][]);
    }
}
