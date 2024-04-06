class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        String res = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(i);
            else if(ch == ')'){
                if(st.isEmpty())
                    set.add(i);
                else
                    st.pop();
            }
        }
        while(!st.isEmpty()){
            set.add(st.pop());
        }

        for(int i=0; i<s.length(); i++){
            if(!set.contains(i))
                res += String.valueOf(s.charAt(i));
        }
        return res;
    }
}