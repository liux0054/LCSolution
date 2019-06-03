package medium;

public class LC357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] count = new int[11];
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 10;
        }

        count[1] = 10;
        count[2] = 81;
        for(int i=3; i<=10; i++){
            count[i] = count[i-1] * (10 - i + 1);
        }
        count[10] = 1;

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += count[i];
        }

        return sum;
    }
}
