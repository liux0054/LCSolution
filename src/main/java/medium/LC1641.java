package medium;

public class LC1641 {
    public int countVowelStrings(int n) {
        int[][] count = new int[51][6];
        for (int i=1; i<=5; i++) {
            count[1][i] = 1;
        }

        for (int i=2; i<=n; i++) {
            count[i][1] = count[i-1][1];
            count[i][2] = count[i-1][1] + count[i-1][2];
            count[i][3] = count[i-1][1] + count[i-1][2] + count[i-1][1] + count[i-1][3];
            count[i][4] = count[i-1][1] + count[i-1][2] + count[i-1][1] + count[i-1][3] + count[i-1][4];
            count[i][5] = count[i-1][1] + count[i-1][2] + count[i-1][1] + count[i-1][3] + count[i-1][4] + count[i-1][5];
        }

        int ans = 0;
        for (int i=1; i<=5; i++) {
            ans += count[n][i];
        }

        return ans;
    }
}
