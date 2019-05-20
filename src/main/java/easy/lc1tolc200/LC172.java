package easy.lc1tolc200;

public class LC172 {

    public int trailingZeroes(int n) {
        long k = 5;
        int answer = 0;
        while(k <= n){
            answer += n/k;
            k *= 5;
        }
        return answer;
    }
}
