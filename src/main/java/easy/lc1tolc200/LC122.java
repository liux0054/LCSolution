package easy.lc1tolc200;

public class LC122 {
    public int maxProfit(int[] prices) {
       if(prices == null || prices.length == 1 || prices.length == 0){
           return 0;
       }

       int[] diff = new int[prices.length];
       for(int i=0; i<prices.length-1; i++){
           diff[i] = prices[i+1] - prices[i];
       }

       int answer = 0;
       for(int i=0; i<diff.length; i++){
           if(diff[i] > 0 ){
               answer += diff[i];
           }
       }

       return answer;
    }
}
