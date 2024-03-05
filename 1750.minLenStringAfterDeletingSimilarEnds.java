class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if(n == 1)
            return 1;
        int l = 0, r = n-1;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                char ch = s.charAt(l);
                while(l<=r && s.charAt(l) == ch)
                    l++;
                while(l<=r && s.charAt(r) == ch)
                    r--;
            }
            else
                break;
        }
        return r-l+1;
    }
}