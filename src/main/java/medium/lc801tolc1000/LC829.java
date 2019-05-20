package medium.lc801tolc1000;

public class LC829 {
    public int consecutiveNumbersSum(int N) {
        int ans = 0;
        int numberOfX = 1;
        int sumOfReminder = 0;
        while(true){
            if((N - sumOfReminder) / numberOfX < 1) break;
            if( (N - sumOfReminder) % numberOfX == 0) ans++;
            sumOfReminder += numberOfX;
            numberOfX++;
        }
        return ans;
    }
}
