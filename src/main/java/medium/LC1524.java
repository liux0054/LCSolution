package medium;

public class LC1524 {
    public int numOfSubarrays(int[] arr) {
        boolean[] oddNumber = new boolean[100000];
        boolean[] oddConsecutiveSum = new boolean[100000];
        for (int i=0; i<arr.length; i++) {
            oddNumber[i] = arr[i] % 2 == 1;
        }
        oddConsecutiveSum[0] = oddNumber[0];
        for (int i=1; i<arr.length; i++) {
            oddConsecutiveSum[i] = oddConsecutiveSum[i-1] ^ oddNumber[i];
        }

        long numberOfOddSum = 0;
        for (int i=0; i<arr.length; i++) {
            if (oddConsecutiveSum[i]) {
                numberOfOddSum++;
            }
        }

        return (int)(numberOfOddSum * (arr.length - numberOfOddSum + 1) % 1000000007);
    }
}
