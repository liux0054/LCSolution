//package medium;
//
//import java.util.List;
//import java.util.Set;
//
//public class LC39 {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//
//    }
//
//    private void getCombinations(int[] candidates, List<Integer> currentList, int currentIndex, int currentSum, int target, Set<Integer> candidatesSet, List<List<Integer>> ans){
//        if (candidatesSet.contains(target - currentSum)){
//            currentList.add(target - currentSum);
//            ans.add(currentList);
//        }else{
//            for(int i= currentIndex; i<candidates.length; i++){
//                currentList.add(candidates[i]);
//                getCombinations(candidates, currentList, currentSum + candidates[i], target, candidatesSet, ans);
//            }
//        }
//    }
//}
