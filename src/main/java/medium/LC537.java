package medium;

public class LC537 {
    public String complexNumberMultiply(String a, String b) {
        Complex aC = new Complex(a);
        Complex bC = new Complex(b);
        return aC.multiply(bC).toString();
    }

    class Complex{
        int a;
        int b;

        public Complex(String complex){
            String[] aAndb = complex.trim().split("\\+");
            a = Integer.parseInt(aAndb[0].trim());
            aAndb[1] = aAndb[1].trim();
            b = Integer.parseInt(aAndb[1].substring(0, aAndb[1].length()-1));
        }

        public Complex(int a, int b){
            this.a = a;
            this.b = b;
        }

        public Complex multiply(Complex complex){
            return new Complex(this.a * complex.a - this.b * complex.b, this.a * complex.b + this.b * complex.a);
        }

        public String toString(){
            return a + "+" + this.b + "i";
        }
    }

}
