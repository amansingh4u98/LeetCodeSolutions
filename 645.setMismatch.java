class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int expSum = n*(n + 1)/2;
        int actSum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            actSum += nums[i];
            if(set.contains(nums[i])){
                ans[0] = nums[i];
            }
            else
                set.add(nums[i]);
        }
        ans[1] = expSum - (actSum - ans[0]);

        return ans;
    }
}