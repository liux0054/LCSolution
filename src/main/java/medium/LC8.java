package medium;

public class LC8 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int cur = 0;
        boolean isPositive = true;
        if (s.charAt(cur) == '-') {
            isPositive = false;
            cur++;
        } else if (s.charAt(cur) == '+') {
            cur++;
        }
        while (cur < s.length() && s.charAt(cur) == '0') {
            cur++;
        }
        StringBuilder accumulated = new StringBuilder();
        while (true) {
            if (cur < s.length() && s.charAt(cur) >= '0' && s.charAt(cur) <= '9') {
                accumulated.append(s.charAt(cur));
                cur++;
            } else {
                break;
            }
        }
        String min = "2147483648";
        String minMinusOne = "2147483647";
        String accumulatedString = accumulated.toString();
        if (accumulatedString.isEmpty()) {
            return 0;
        }
        if (isPositive) {
            if (accumulatedString.length() > minMinusOne.length() ||
                    (accumulated.length() == minMinusOne.length() && accumulatedString.compareTo(minMinusOne) >= 0)) {
                return Integer.parseInt(minMinusOne);
            } else {
                return Integer.parseInt(accumulatedString);
            }
        } else {
            if (accumulatedString.length() > min.length() ||
                    (accumulated.length() == min.length() && accumulatedString.compareTo(min) >= 0)) {
                return Integer.parseInt("-" + min);
            } else {
                return Integer.parseInt("-" + accumulatedString);
            }
        }
    }
}
