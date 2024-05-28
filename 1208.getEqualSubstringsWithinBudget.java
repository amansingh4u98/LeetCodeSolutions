class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int sum = 0, maxLen = 0;
        int l = 0, r = 0;
        for(; r<n; r++){
            int diff = Math.abs(s.charAt(r)-t.charAt(r));
            sum += diff;        
            while(sum > maxCost){
                sum -= Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}