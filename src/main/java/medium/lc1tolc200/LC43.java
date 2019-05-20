package medium.lc1tolc200;

public class LC43 {

    public String multiply(String num1, String num2) {
         int[] a = new int[num1.length()];
         int[] b = new int[num2.length()];
         int[] product = new int[num1.length()+num2.length()];

         for(int i=0; i<num1.length(); i++){
             a[i] = Character.getNumericValue(num1.charAt(num1.length()-1-i));
         }

         for(int i=0; i<num2.length(); i++){
             b[i] = Character.getNumericValue(num2.charAt(num2.length()-1-i));
         }

         for(int i=0; i<a.length; i++){
             for(int j=0; j<b.length; j++){
                 int carry = (product[i+j] +  a[i] * b[j]) / 10;
                 product[i+j]  = (product[i+j] +  a[i] * b[j]) % 10;
                 product[i+j+1] += carry;
             }
         }


         int i = product.length-1;
         while(i>0 && product[i] == 0) i--;
         String ans = "";
         for(int j=i; j>=0; j--){
             ans = ans + Integer.toString(product[j]);
         }

         return ans;
    }

}
