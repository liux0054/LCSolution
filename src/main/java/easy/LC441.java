package easy;

public class LC441 {

    public int arrangeCoins(int n) {
        //minimum k such that (1+k)*k > n
        int k = (int) Math.sqrt(n);
        while(k * (k+1) < 2 * n){
            k++;
        }
        if(k * (k+1) == 2 * n) {
            return k;
        }
        else {
            return k-1;
        }
    }
}
