class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length, sum = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<n; i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem < 0)
                rem += k;
            
            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}