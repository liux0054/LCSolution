package medium.lc801tolc1000;

import java.util.Stack;

public class LC921 {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for(Character c:S.toCharArray()){
            if(c == '(') {
                stack.push(c);
            }else{
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.size();
    }
}
