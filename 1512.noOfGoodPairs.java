class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int t = nums[i];
            if(map.containsKey(t)){
                map.put(t, map.get(t)+1);
            }
            else
                map.put(t, 1);
        }
        for(int k : map.keySet()){
            int val = map.get(k);
            cnt += val * (val - 1)/2;
        }
        return cnt;
    }
}