import java.util.Stack;

public class LC394 {
    public String decodeString(String s) {
        Stack<Character> characterStack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c != ']'){
                characterStack.push(c);
            }else{
                String repeatString = "";
                while(characterStack.peek() != '['){
                    repeatString = characterStack.pop() + repeatString;
                }
                characterStack.pop();
                String repeatTimes = "";
                while(!characterStack.empty() && characterStack.peek() >= '0' && characterStack.peek()<='9') {
                    repeatTimes = characterStack.pop() + repeatTimes;
                }
                int repeatNumbers = Integer.parseInt(repeatTimes);
                String tempRepeatString = "";
                for(int i=1; i<=repeatNumbers; i++){
                    tempRepeatString += repeatString;
                }
                for(Character c1:tempRepeatString.toCharArray()){
                    characterStack.push(c1);
                }
            }
        }
        String ans = "";
        while (!characterStack.empty()){
            ans = characterStack.pop() + ans;
        }
        return ans;
    }
}
