package easy;

public class LC67 {

    public String addBinary(String a, String b) {
       StringBuilder sa = new StringBuilder().append(a).reverse();
       StringBuilder sb = new StringBuilder().append(b).reverse();
       int[] intA = new int[Math.max(sb.length(), sa.length())+1];
       int[] intB = new int[Math.max(sb.length(), sa.length())+1];
       int[] intResult = new int[Math.max(sb.length(), sa.length())+1];
       for(int i=0; i<sa.length(); i++){
           intA[i] = Character.getNumericValue(sa.charAt(i));
       }

       for(int i=0; i<sb.length(); i++){
            intB[i] = Character.getNumericValue(sb.charAt(i));
       }

       int carry=0;
       int i;
       for(i=0; i<Math.max(sa.length(), sb.length()); i++){
           intResult[i] = (intA[i] + intB[i] + carry)%2;
           carry = (intA[i] + intB[i] + carry)/2;
       }

       intResult[i] = carry;

       int begin = intResult.length-1;
       while(begin > 0 && intResult[begin] == 0) {
           begin--;
       }
       String ans = "";
       for(i=begin; i>=0; i--){
           ans += Integer.toString(intResult[i]);
       }
       return ans;
    }
}
