class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int temp = matches[i][1];
            set.add(matches[i][0]);
            set.add(temp);
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }
            else{
                map.put(temp, 1);
            }
        }
        List<Integer> zeroOcc = new ArrayList<>();
        List<Integer> oneOcc = new ArrayList<>();
        for(Integer i : set){
            if(map.containsKey(i)){
                int val = map.get(i);
                if(val == 1){
                    oneOcc.add(i);
                }
            }
            else{
                zeroOcc.add(i);
            }
        }
        Collections.sort(zeroOcc);
        Collections.sort(oneOcc);
        ans.add(zeroOcc);
        ans.add(oneOcc);

        return ans;
    }
}