package easy.lc401tolc600;

public class LC441 {

    public int arrangeCoins(int n) {
        int k = (int) (Math.sqrt(n) * Math.sqrt(2));
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
