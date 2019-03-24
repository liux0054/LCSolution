package easy;

import java.util.HashSet;
import java.util.Set;

public class LC929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for(String email:emails){
            int posOfAt = email.indexOf('@');
            int posOfPlus = email.indexOf('+');
            if(posOfPlus != -1 && posOfPlus < posOfAt){
                email = email.substring(0, posOfPlus) + email.substring(posOfAt);
            }
            posOfAt = email.indexOf('@');
            email = email.substring(0, posOfAt).replace(".", "") + email.substring(posOfAt);
            emailSet.add(email);
        }
        return emailSet.size();
    }
}
