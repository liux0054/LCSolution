package easy.lc801tolc1000;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LC970 {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int product1 = 1;
        int product2 = 1;
        Set<Integer> candidates = new HashSet<>();
        int bigger = x > y ? x : y;
        int smaller = x <= y ? x : y;

        if(bigger == 1) {
            candidates.add(2);
        }
        else{
            while(product1 + product2 <= bound){
                while(product1 + product2 <= bound){
                    candidates.add(product1 + product2);
                    if(smaller == 1){
                        break;
                    }else{
                        product2 *= smaller;
                    }
                }
                product2 = 1;
                product1 *= bigger;
            }
        }
        return candidates.stream().filter(value -> value <= bound).collect(Collectors.toList());
    }
}
