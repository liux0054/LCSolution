package easy.lc601tolc800;

public class LC746 {
    public int minCostClimbingStairs(int[] cost) {
       int[] sumOfCost = new int[cost.length];
       sumOfCost[0] = 0;
       sumOfCost[1] = 0;
       for(int i=2; i<cost.length; i++){
           sumOfCost[i] = Math.min(sumOfCost[i-1] + cost[i-1], sumOfCost[i-2] + cost[i-2]);
       }
       return sumOfCost[cost.length-1];
    }
}
