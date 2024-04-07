class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Integer[][] t = new Integer[n][n];
        return isValidString(0, 0, s, t);
    }

    private boolean isValidString(int idx, int open, String str, Integer[][] t) {
        if (idx == str.length()) {
            return (open == 0);
        }
        if (t[idx][open] != null) {
            return t[idx][open] == 1;
        }
        boolean isValid = false;
        if (str.charAt(idx) == '*') {
            isValid |= isValidString(idx + 1, open + 1, str, t);
            if (open > 0) {
                isValid |= isValidString(idx + 1, open - 1, str, t);
            }
            isValid |= isValidString(idx + 1, open, str, t);
        } else {
            if (str.charAt(idx) == '(') {
                isValid = isValidString(idx + 1, open + 1, str, t);
            } else if (open > 0) {
                isValid = isValidString(idx + 1, open - 1, str, t);
            }
        }
        t[idx][open] = isValid ? 1 : 0;
        return isValid;
    }
}