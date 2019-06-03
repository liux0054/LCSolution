package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC756 {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Queue<String> patternsByLevel = new LinkedList<>();
        patternsByLevel.offer(bottom);
        while(patternsByLevel.peek().length() != 1){
            String levelPattern = patternsByLevel.poll();
            Queue<String> patternsOnThisLevel = new LinkedList<>();
            patternsOnThisLevel.offer("");
            for(int i=0; i<levelPattern.length()-1; i++){
                String start = patternsOnThisLevel.poll();
                String prefix = levelPattern.substring(i, i+2);
                for(String allow : allowed){
                    if(allow.startsWith(prefix)){
                        patternsOnThisLevel.add(start + allow.substring(2));
                    }
                }
            }
            if(patternsOnThisLevel.isEmpty()){
                return false;
            }
            patternsByLevel.addAll(patternsOnThisLevel);
        }
        return true;
    }
}
