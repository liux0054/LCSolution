package medium.lc1tolc200;

import java.util.List;

public class LC120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] f = new int[triangle.size()][triangle.size()];
        f[0][0] = triangle.get(0).get(0);

        for(int i=1; i<triangle.size(); i++){
            for(int j=0; j<=i; j++){
                if(j > 0 && j<i){
                    f[i][j] = Math.min(f[i-1][j-1], f[i-1][j]) + triangle.get(i).get(j);
                }else if(j==0){
                    f[i][j] = f[i-1][j] + triangle.get(i).get(j);
                }else{
                    f[i][j] = f[i-1][j-1] + triangle.get(i).get(j);
                }
            }
        }

        int answer = Integer.MAX_VALUE;
        for(int j=0; j<triangle.size(); j++){
            answer = Math.min(answer, f[triangle.size()-1][j]);
        }

        return answer;
    }
}
