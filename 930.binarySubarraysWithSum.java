class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int i = 0, j = 0;
        int windowSum = 0, zeroCnt = 0;
        int ans = 0;
        while (j < n) {
            windowSum += nums[j];

            while (i < j && (nums[i] == 0 || windowSum > goal)) {
                if (nums[i] == 0) {
                    zeroCnt++;
                } else {
                    zeroCnt = 0;
                }
                windowSum -= nums[i];
                i++;
            }

            if (windowSum == goal) {
                ans += 1 + zeroCnt;
            }

            j++;
        }
        return ans;
    }
}