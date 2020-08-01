package medium;

public class LC11 {
    public int maxArea(int[] height) {
        int frontMaxHeight = Integer.MIN_VALUE;
        int answer = 0;
        
        for (int i=0; i<height.length-1; i++) {
            if (height[i] <= frontMaxHeight) {
                continue;
            } else {
                frontMaxHeight = height[i];
            }

            int backMaxHeight = Integer.MIN_VALUE;
            
            for (int j=height.length-1; j>i; j--) {
                if (height[j] <= backMaxHeight) {
                    continue;
                } else {
                    backMaxHeight = height[j];
                }
                answer = Math.max(answer, Math.min(height[i], height[j]) * (j-i));
            }
        }
        return answer;
    }
}
