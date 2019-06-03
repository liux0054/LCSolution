package easy;

public class LC415 {

    public String addStrings(String num1, String num2) {
        int[] num1Int = new int[Math.max(num1.length(), num2.length())+1];
        int[] num2Int = new int[num1Int.length];

        StringBuilder num1B = new StringBuilder().append(num1).reverse();
        StringBuilder num2B = new StringBuilder().append(num2).reverse();

        for(int i=0; i<num1.length(); i++){
            num1Int[i] = Character.getNumericValue(num1B.charAt(i));
        }

        for(int i=0; i<num2.length(); i++){
            num2Int[i] = Character.getNumericValue(num2B.charAt(i));
        }

        int carry = 0;
        for(int i=0; i<Math.max(num1Int.length, num2Int.length); i++){
            int sum = num1Int[i] + num2Int[i] + carry;
            carry = sum/10;
            num1Int[i] = sum % 10;
        }
        int i = num1Int.length-1;
        while(i > 0 && num1Int[i] == 0){
            i--;
        }
        String ans = "";
        for(int j=i; j>=0; j--){
            ans += Integer.toString(num1Int[j]);
        }
        return ans;
    }
}
