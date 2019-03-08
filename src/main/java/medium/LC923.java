//package medium;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class LC923 {
//
//    public int threeSumMulti(int[] A, int target) {
//        Arrays.sort(A);
//        Map<Integer, Integer> count = new HashMap<>();
//        Map<Integer, Integer> initialCount = new HashMap<>();
//
//        Arrays.stream(A).forEach(candidate -> {
//            if(!count.containsKey(candidate)){
//                count.put(candidate, 1);
//            }else{
//                count.put(candidate, count.get(candidate)+1);
//            }
//            initialCount.put(candidate, 0);
//        });
//    }
//
//    private int getNumberOfCombinations(int[] candidates, int currentSum, int currentIndex, int target, Map<Integer, Integer> currentCount, Map<Integer, Integer>count){
//        if(currentSum == target){
//
//        }
//    }
//
//    private int calculateWaysOfCombinations(int m, int n){
//        if(m == n){
//            return 1;
//        }
//        int sum = 1;
//        for(int )
//    }
//
//
//}
