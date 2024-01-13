class Solution {
    public int minSteps(String s, String t) {
        int[] smap = new int[26];
        int[] tmap = new int[26];
        int cnt = 0;
        for(char ch : s.toCharArray()){
            smap[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            tmap[ch - 'a']++;
        }  

        for(int i=0; i<tmap.length; i++){
            if(smap[i] == 0 && tmap[i] == 0)
                continue;
            else if(tmap[i] < smap[i]){
                cnt += smap[i] - tmap[i];
            }
        }
        return cnt;
    }
}