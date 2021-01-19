package medium;

import java.util.ArrayList;
import java.util.List;

public class LC89 {
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(0);
        answer.add(1);
        int multiplier = 2;
        for (int i=1; i<n; i++) {
            int j = answer.size() - 1;
            while (j >= 0) {
                answer.add(answer.get(j) + multiplier);
                j--;
            }
            multiplier *= 2;
        }
        return answer;
    }
}
