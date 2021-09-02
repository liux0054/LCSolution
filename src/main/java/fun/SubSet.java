package fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSet {
       public static void main(String[] args) {
           subsetsWithDup(new int[]{1, 1, 2, 2});
       }

        public static List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            addSubSets(ans, new ArrayList<>(), 0, nums);
            return ans;
        }

        private static void addSubSets(List<List<Integer>> ans, List<Integer> current, int currentIndex, int[] nums) {
            if (currentIndex == nums.length) {
                if (!containsIgnoreOrder(ans, current)) {
                    ans.add(new ArrayList<>(current));
                }
                return;
            }

            //ans.add(new ArrayList<>(current));
            //not include current
            addSubSets(ans, current, currentIndex+1, nums);


            //include current
            current.add(nums[currentIndex]);
            addSubSets(ans, current, currentIndex+1, nums);
            current.remove(current.size()-1);
        }

        private static boolean containsIgnoreOrder(List<List<Integer>> mon, List<Integer> son) {
            for (List<Integer> l : mon) {
                List<Integer> lsorted = new ArrayList<>(l);
                List<Integer> sonSorted = new ArrayList<>(son);
                Collections.sort(lsorted);
                Collections.sort(sonSorted);
                boolean sortedEqual = (lsorted.size() == sonSorted.size());
                if (sortedEqual) {
                    for (int i = 0; i < lsorted.size(); i++) {
                        if (lsorted.get(i) != lsorted.get(i)) {
                            sortedEqual = false;
                            break;
                        }
                    }
                }
                if (sortedEqual) {
                    return true;
                }
            }

            return false;
        }
}

