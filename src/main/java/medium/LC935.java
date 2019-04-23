package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC935 {
    public int knightDialer(int N) {
        int[][] f = new int[10][N+1];

        for(int i=0; i<10; i++){
            f[i][1] = 1;
        }

        Map<Integer, Set<Integer>> transfer = new HashMap<>();
        transfer.put(0, new HashSet<>(Arrays.asList(4, 6)));
        transfer.put(1, new HashSet<>(Arrays.asList(6, 8)));
        transfer.put(2, new HashSet<>(Arrays.asList(7, 9)));
        transfer.put(3, new HashSet<>(Arrays.asList(4, 8)));
        transfer.put(4, new HashSet<>(Arrays.asList(3, 9, 0)));
        transfer.put(5, new HashSet<>());
        transfer.put(6, new HashSet<>(Arrays.asList(1,7,0)));
        transfer.put(7, new HashSet<>(Arrays.asList(2, 6)));
        transfer.put(8, new HashSet<>(Arrays.asList(1, 3)));
        transfer.put(9, new HashSet<>(Arrays.asList(4, 2)));

        for(int i=2; i<=N; i++){
            for(int j=0; j<=9; j++){
                for(int from : transfer.get(j)){
                    f[j][i] += f[from][i-1] % 1000000007;
                    f[j][i] %= 1000000007;
                }
            }
        }

        int answer = 0;
        for(int j=0; j<=9; j++){
            answer += f[j][N] % 1000000007;
            answer %=  1000000007;
        }

        return answer;
    }
}
