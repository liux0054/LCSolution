package easy;

public class LC754 {

    public int reachNumber(int target) {
        target = Math.abs(target);
        int n = (int)Math.sqrt(2 * target);
        while (true){
            int sumTillN = n * (n+1)/2;
            if(sumTillN - target >= 0 && (sumTillN - target) % 2 == 0){
                return n;
            }else{
                n++;
            }
        }
    }
}
