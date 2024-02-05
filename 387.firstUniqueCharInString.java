class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
           char ch = s.charAt(i);

           if(arr[ch - 'a'] == 0 && i == s.lastIndexOf(ch))
            return i;
           arr[ch - 'a']++;
        }
        return -1;
    }
}