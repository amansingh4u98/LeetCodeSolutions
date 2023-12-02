class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for(String word : words)
        {   
            if(isGood(word, chars)){
                ans += word.length();
            }
        }
        return ans;
    }

    public boolean isGood(String word, String chars){
        boolean isGood = true;
        char[] arr = new char[26];
        for(int i=0; i<chars.length(); i++){
            char ch = chars.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(arr[ch - 'a'] == 0){
                return false;
            }
            else{
                arr[ch - 'a']--;
            }
        }
        return isGood;        
    }
}