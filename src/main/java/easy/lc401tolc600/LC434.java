package easy.lc401tolc600;

import java.util.Arrays;

public class LC434 {
    public int countSegments(String s) {
        return (int) Arrays.stream(s.split(" ")).filter(ss -> !ss.equals("")).count();
    }
}
