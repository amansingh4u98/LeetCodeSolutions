class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == 'a' && st.peek() == 'b'){
                st.pop();
                cnt++;
            }
            else
                st.push(ch);
        }
        return cnt;
    }
}