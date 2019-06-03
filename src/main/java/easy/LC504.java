package easy;

public class LC504 {

    public String convertToBase7(int num) {
        return num < 0 ? "-" + getBase7(Math.abs(num)) : getBase7(Math.abs(num));
    }

    private String getBase7(int num) {
       if(num < 7) {
           return Integer.toString(num);
       }
       else{
           return getBase7(num/7) + num % 7;
       }
    }
}
