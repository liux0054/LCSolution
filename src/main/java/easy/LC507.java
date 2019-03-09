package easy;

public class LC507 {

    public boolean checkPerfectNumber(int num) {
        if(num == 1) {
            return false;
        }

        int reminder = num;
        for(int i=(int)Math.sqrt(num); i>1; i--){
            if(num % i == 0){
                reminder -= i;
                reminder -= num / i;
            }
            if(reminder <0){
                return false;
            }
        }
        return reminder == 1;
    }
}
