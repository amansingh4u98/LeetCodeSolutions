class Solution {
    public boolean closeStrings(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length();
        if(l1 != l2)
            return false;
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for(char ch : word1.toCharArray()){
            map1[ch - 'a']++;
        }
        for(char ch : word2.toCharArray()){
            map2[ch - 'a']++;
        }

        for(int i=0; i<26; i++){
            if((map1[i] == 0 && map2[i] != 0) || (map1[i] != 0 && map2[i] == 0))
                return false;
        }

        Arrays.sort(map1);
        Arrays.sort(map2);

        for(int i=0; i<26; i++){
            if(map1[i] != map2[i])
                return false;
        }
        
        return true;
    }
}