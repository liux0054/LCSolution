package easy;


public class LC598 {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops == null || ops.length == 0){
            return m * n;
        }
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(int[] coordinates:ops){
            if(coordinates[0] < minX){
                minX = coordinates[0];
            }
            if(coordinates[1] < minY){
                minY = coordinates[1];
            }
        }
        return minX * minY;
    }
}
